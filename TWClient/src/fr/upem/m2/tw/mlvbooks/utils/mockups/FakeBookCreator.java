package fr.upem.m2.tw.mlvbooks.utils.mockups;

import java.util.ArrayList;
import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.beans.LightBook;

public final class FakeBookCreator {
  private FakeBookCreator() {}
  
  public static List<LightBook> createLightBooks(int amount) {
    List<LightBook> books = new ArrayList<>();
    for (long i = 0; i < amount; i++) {
      LightBook book = new LightBook();
      book.setId(i);
      book.setAuthor("Author " + Long.toString(i));
      book.setPrice((double) i);
      book.setTitle("Title" + Long.toString(i));
      books.add(book);
    }
    return books;
  }
}
