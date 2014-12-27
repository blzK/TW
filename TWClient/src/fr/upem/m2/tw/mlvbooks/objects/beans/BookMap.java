package fr.upem.m2.tw.mlvbooks.objects.beans;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * An implementation of {@link AbstractMap} that maps quantities to books.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public final class BookMap extends AbstractMap<LightBook, Integer> implements
    Serializable {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -1990760507365279837L;

  private Map<LightBook, Integer> books;

  public BookMap() {
    books = new HashMap<>();
  }

  @Override
  public Integer put(LightBook book, Integer quantity) {
    if (book.getId() == null || book.getPrice() == null) {
      throw new IllegalArgumentException();
    }
    return books.put(book, Objects.requireNonNull(quantity));
  }

  @Override
  public boolean containsKey(Object key) {
    return books.containsKey(key);
  }

  @Override
  public Integer get(Object key) {
    return books.get(key);
  }

  @Override
  public Set<java.util.Map.Entry<LightBook, Integer>> entrySet() {
    return Collections.unmodifiableSet(books.entrySet());
  }

  @Override
  public Integer remove(Object key) {
    throw new UnsupportedOperationException();
  }

  public Map<LightBook, Integer> getBooks() {
    return books;
  }

  public void setBooks(Map<LightBook, Integer> books) {
    this.books = books;
  }
}
