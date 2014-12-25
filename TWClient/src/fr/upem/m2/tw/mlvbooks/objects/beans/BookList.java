package fr.upem.m2.tw.mlvbooks.objects.beans;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * {@link LightBook} container class.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class BookList extends AbstractList<LightBook> implements Serializable {
  /**
   * Serial UID.
   */
  private static final long serialVersionUID = 146531716574102632L;
  private List<LightBook> books;
  
  /**
   * Default constructor.
   */
  public BookList() {
    books = new ArrayList<>();
  }
  
  @Override
  public boolean add(LightBook book) {
    return books.add(book);
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
    return books.iterator();
  }
}
