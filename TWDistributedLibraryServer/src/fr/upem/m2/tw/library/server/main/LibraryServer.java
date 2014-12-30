package fr.upem.m2.tw.library.server.main;


import java.rmi.Naming;

public class LibraryServer {

	private static int port = 1099; 
	
	private static String uri = "rmi://localhost:" + port + "/LibraryService";
	
	public LibraryServer() {
		try {
			Library  library = new LibraryImp();
			Naming.rebind(uri, library);
		}
		catch (Exception e) {
			System.out.println("Issue: " + e);
		}
	}
	
	public static void main(String[] args) {
		new LibraryServer();
	}
	
}
