package fr.upem.m2.tw.mlvbooks.objects.beans;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * {@link LightBook} container class.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class Books extends AbstractList<LightBook> implements Serializable {
  /**
   * Serial UID.
   */
  private static final long serialVersionUID = 146531716574102632L;
  private List<LightBook> books;
  
  /**
   * Default constructor.
   */
  public Books() {
    books = new ArrayList<>();
  }
  
  @Override
  public boolean add(LightBook book) {
    return books.add(Objects.requireNonNull(book));
  }
  
  @Override
  public boolean addAll(Collection<? extends LightBook> c) {
    return books.addAll(c);
  }
  
  @Override
  public LightBook get(int index) {
    return books.get(index);
  }

  @Override
  public int size() {
    return books.size();
  }

  @Override
  public Iterator<LightBook> iterator() {
    return Collections.unmodifiableList(books).iterator();
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }
}
