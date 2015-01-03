package fr.upem.m2.tw.library.server.main;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.dto.HeavyBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.LightBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

/**
 * Provides methods to drive the application book library (consult, add,
 * remove). Please add new features via this interface.
 * 
 * @author Alexandre SALIMI (alexander.salimi@gmail.com)
 */

public interface Library extends Remote {

  /**
   * Add a heavy book to the library. This book representation offers more
   * properties than a light one. Useful for internal app data management.
   * 
   * @param id which must be manually provided (see the client example).
   * @param title of the book
   * @throws RemoteException
   */
  public boolean addBook(Long id, String title, String author)
      throws RemoteException;

  public boolean addExistingBook(HeavyBookDTO book) throws RemoteException;

  public void remove(Long isbn) throws RemoteException;

  public LightBookDTO searchLightBookById(Long id) throws RemoteException;

  public HeavyBookDTO searchHeavyBookById(Long id) throws RemoteException;

  public List<LightBookDTO> searchBook(SearchParametersDTO searchParametersDTO)
      throws RemoteException;
  
  public List<LightBookDTO> searchByTitle(String title) throws RemoteException;

  public List<LightBookDTO> searchByAuthor(String title) throws RemoteException;

  public LightBookDTO searchByISBN(String ISBN) throws RemoteException;

}
