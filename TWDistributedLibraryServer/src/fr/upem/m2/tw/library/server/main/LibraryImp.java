package fr.upem.m2.tw.library.server.main;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import fr.upem.m2.tw.mlvbooks.objects.dto.BookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.HeavyBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.LightBookDTO;

public class LibraryImp extends UnicastRemoteObject implements Library, Serializable {

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = 899577144233055923L;
	
	private final Map<Long, BookDTO> books;

	protected LibraryImp() throws RemoteException {
		super();
		books = new HashMap<Long, BookDTO>();
	}

	@Override
	public boolean addLightBook(Long id, String title, String author)
			throws RemoteException {
		Objects.requireNonNull(id);
		BookDTO book = new LightBookDTO(id, title, author);
		if (books.containsKey(book.getId()))
			return false;
		books.put(book.getId(), book);
		return true;
	}

	@Override
	public boolean addHeavyBook(Long id, String title, String author)
			throws RemoteException {
		Objects.requireNonNull(id);
		BookDTO book = new HeavyBookDTO(id, title, author);
		if (books.containsKey(book.getId()))
			return false;
		books.put(book.getId(), book);
		return true;
	}

	@Override
	public boolean addExistingBook(BookDTO book)
			throws RemoteException {
		Objects.requireNonNull(book.getId());
		if (books.containsKey(book.getId()))
			return false;
		books.put(book.getId(), book);
		return true;
	}

	@Override
	public void remove(Long isbn)
			throws RemoteException {
		if (books.containsKey(isbn))
			books.remove(isbn);
	}

	@Override
	public List<BookDTO> searchById(Long id)
			throws RemoteException {
		Objects.requireNonNull(id);
		if (books.isEmpty())
			return null;
		List<BookDTO> results = new ArrayList<BookDTO>();
		for (Long elementId: books.keySet()) {
			BookDTO book = books.get(id);
			if (book.getId().equals(elementId))
				results.add(book);
		}
		return results;
	}

	@Override
	public List<BookDTO> searchByTitle(String title) throws RemoteException{
		Objects.requireNonNull(title);
		if (books.isEmpty())
			return null;
		List<BookDTO> results = new ArrayList<BookDTO>();
		for (Long elementId: books.keySet()) {
			BookDTO book = books.get(elementId);
			if (book.getTitle().equals(title))
				results.add(book);
		}
		return results;
	}

	@Override
	public List<BookDTO> searchByAuthor(String author) throws RemoteException{
		Objects.requireNonNull(author);
		if (books.isEmpty())
			return null;
		List<BookDTO> results = new ArrayList<BookDTO>();
		for (Long elementId: books.keySet()) {
			BookDTO book = books.get(elementId);
			if (book.getAuthor().equals(author))
				results.add(book);
		}
		return results;
	}
	
	@Override
	public List<BookDTO> searchByPriceRange(Long minimum, Long maximum) {
		Objects.requireNonNull(minimum);
		Objects.requireNonNull(maximum);
		if (books.isEmpty())
			return null;
		List<HeavyBookDTO> results = new ArrayList<HeavyBookDTO>();
		for (Long elementId: books.keySet()) {
			HeavyBookDTO heavyBook = books.get(elementId);
			//Problème avec les HeavyBook 
			if 
			if (book.getAuthor().equals(author))
				results.add(book);
		}
		return results;
	}

}
