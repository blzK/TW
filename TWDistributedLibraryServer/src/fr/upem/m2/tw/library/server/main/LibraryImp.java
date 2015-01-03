package fr.upem.m2.tw.library.server.main;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import fr.upem.m2.tw.mlvbooks.objects.dto.HeavyBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.LightBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

public class LibraryImp extends UnicastRemoteObject implements Library,
    Serializable {

  /**
   * Serial UID
   */
  private static final long serialVersionUID = 899577144233055923L;

  private final Map<Long, HeavyBookDTO> books;

  private Mapper mapper = new DozerBeanMapper();

  protected LibraryImp() throws RemoteException {
    super();
    books = new ConcurrentHashMap<>();
  }

  @Override
  public boolean addBook(Long id, String title, String author)
      throws RemoteException {
    Objects.requireNonNull(id);
    HeavyBookDTO book = new HeavyBookDTO();
    book.setId(id);
    book.setAuthor(author);
    book.setTitle(title);
    if (books.containsKey(book.getId()))
      return false;
    books.put(book.getId(), book);
    return true;
  }

  @Override
  public boolean addExistingBook(HeavyBookDTO book) throws RemoteException {
    Objects.requireNonNull(book.getId());
    if (books.containsKey(book.getId()))
      return false;
    books.put(book.getId(), book);
    return true;
  }

  @Override
  public void remove(Long id) throws RemoteException {
    books.remove(id);
  }

  @Override
  public LightBookDTO searchLightBookById(Long id) throws RemoteException {
    if (books.isEmpty() || id == null) {
      return null;
    }
    HeavyBookDTO heavyBook = books.get(id);
    if (heavyBook == null) {
      return null;
    }
    return mapper.map(heavyBook, LightBookDTO.class);
  }

  @Override
  public HeavyBookDTO searchHeavyBookById(Long id) throws RemoteException {
    if (books.isEmpty() || id == null) {
      return null;
    }
    return books.get(id);
  }

  @Override
  public List<LightBookDTO> searchByTitle(String title) throws RemoteException {
    if (books.isEmpty() || title == null)
      return null;
    List<LightBookDTO> results = new ArrayList<>();
    for (Long elementId : books.keySet()) {
      HeavyBookDTO book = books.get(elementId);
      if (book.getTitle().equals(title)) {
        results.add(mapper.map(book, LightBookDTO.class));
      }
    }
    return results;
  }

  @Override
  public List<LightBookDTO> searchByAuthor(String author)
      throws RemoteException {
    if (books.isEmpty() || author == null)
      return null;
    List<LightBookDTO> results = new ArrayList<>();
    for (Long elementId : books.keySet()) {
      HeavyBookDTO book = books.get(elementId);
      if (book.getAuthor().equals(author))
        results.add(mapper.map(book, LightBookDTO.class));
    }
    return results;
  }

  @Override
  public LightBookDTO searchByISBN(String ISBN) throws RemoteException {
    if (books.isEmpty() || ISBN == null)
      return null;
    for (Long elementId : books.keySet()) {
      HeavyBookDTO book = books.get(elementId);
      if (book.getISBN().equals(ISBN))
        return mapper.map(book, LightBookDTO.class);
    }
    return null;
  }

  @Override
  public List<LightBookDTO> searchBook(SearchParametersDTO searchParametersDTO)
      throws RemoteException {
    if (searchParametersDTO == null || books == null) {
      return null;
    }
    List<LightBookDTO> searchedByTitle = null;
    List<LightBookDTO> searchedByAuthor = null;
    List<LightBookDTO> searchedByISBN = null;
    if (searchParametersDTO.getTitle() != null) {
      searchedByTitle = searchByTitle(searchParametersDTO.getTitle());
    }
    if (searchParametersDTO.getAuthor() != null) {
      searchedByAuthor = searchByAuthor(searchParametersDTO.getAuthor());
    }
    if (searchParametersDTO.getISBN() != null) {
      LightBookDTO book = searchByISBN(searchParametersDTO.getISBN());
      searchedByISBN = (book == null) ? null : Arrays.asList(book);
    }
    searchedByTitle.retainAll(searchedByAuthor);
    searchedByTitle.retainAll(searchedByISBN);
    return (searchedByTitle.isEmpty()) ? null : searchedByTitle;
  }
}
