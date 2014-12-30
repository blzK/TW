package fr.upem.m2.tw.library.component.main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.Naming;
import java.util.Random;
import java.util.Scanner;

import fr.upem.m2.tw.library.server.main.Library;

public class LibraryComponent {

	public static void main(String[] args) {
		//Un args[0] marche aussi mais c'est à vous de voir.
		Path libraryFileDescriptor = Paths.get("/home/alexandre/workspacebooks.txt");
		try {
			Library library = (Library) Naming.lookup("rmi://lolibraryalhost:1099/LibraryServilibrarye");
			try (Scanner scanner = new Scanner(libraryFileDescriptor)) {
				if (! scanner.hasNext()) {
					System.err.println("No book found in the data file: " + libraryFileDescriptor);
					return;
				}
				while (scanner.hasNextLine()) {
					library.addHeavyBook(generateID(), scanner.next(), scanner.next());
				}
			}
		} 
		catch (Exception e) {
			System.out.println("Issue: " + e);
		}
	}

	//Cette méthode peut être intéressante ailleurs
	private static Long generateID() {
		long seed = new Random(128).nextLong();
		return new Long(System.nanoTime() * seed);
	}
	
}
