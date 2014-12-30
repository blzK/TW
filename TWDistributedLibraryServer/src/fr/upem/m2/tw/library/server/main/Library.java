package fr.upem.m2.tw.library.server.main;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.dto.BookDTO;


/**
 * Provides methods to drive the application book library (consult, add, remove).
 * Please add new features via this interface.
 * @author Alexandre SALIMI (alexander.salimi@gmail.com)
 */

public interface Library extends Remote{
	
	/**
	 * Add a heavy book to the library. This book representation offers more
	 * properties than a light one. Useful for internal app data management.
	 * @param id which must be manually provided (see the client example).
	 * @param title of the book
	 * @throws RemoteException
	 */
	public boolean addHeavyBook(Long id, String title, String author) throws RemoteException;
	
	/**
	 * Add a heavy book to the library. This book representation offers more
	 * properties than a light one. Useful for internal app data management.
	 * @param id which must be manually provided (see the client example).
	 * @param title of the book
	 * @throws RemoteException
	 */
	public boolean addLightBook(Long id, String title, String author) throws RemoteException;
	
	public boolean addExistingBook(BookDTO book) throws RemoteException;
	
	public void remove(Long isbn) throws RemoteException;
	
	public List<BookDTO> searchById(Long Id) throws RemoteException;
	
	public List<BookDTO> searchByTitle(String title) throws RemoteException;
	
	public List<BookDTO> searchByAuthor(String title) throws RemoteException;
	
	public List<BookDTO> searchByPriceRange(Long minimum, Long maximum);
	
}
