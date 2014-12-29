package fr.upem.m2.tw.library.server.main;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.dto.BookDTO;


public interface Library extends Remote{
	
	public boolean addHeavyBook(Long id, String title, String author) throws RemoteException;
	
	public boolean addLightBook(Long id, String title, String author) throws RemoteException;
	
	public boolean addExistingBook(BookDTO book) throws RemoteException;
	
	public void remove(Long isbn) throws RemoteException;
	
	public List<BookDTO> searchById(Long id) throws RemoteException;
	
	public List<BookDTO> searchByTitle(String title) throws RemoteException;
	
	public List<BookDTO> searchByAuthor(String title) throws RemoteException;
	
}
