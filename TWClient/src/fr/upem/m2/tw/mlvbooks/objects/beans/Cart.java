package fr.upem.m2.tw.mlvbooks.objects.beans;

import java.io.Serializable;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * A simple cart implementation.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public final class Cart implements Serializable {
  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -6420661198612097712L;
  private BookMap books;
  
  public Cart() {
    books = new BookMap();
  }

  public Double getTotalPrice() {
    double sum = 0.0;
    for (Entry<LightBook, Integer> book : books.entrySet()) {
      sum += book.getKey().getPrice() * book.getValue();
    }
    return sum;
  }
  public BookMap getBooks() {
    return books;
  }
  public void setBooks(BookMap books) {
    this.books = Objects.requireNonNull(books);
  }
}
