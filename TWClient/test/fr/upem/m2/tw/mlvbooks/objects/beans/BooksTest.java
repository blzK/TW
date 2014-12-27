package fr.upem.m2.tw.mlvbooks.objects.beans;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class BooksTest {

  @Test(expected = NullPointerException.class)
  public void testAddWithNullBook() {
    Books bookList = new Books();
    bookList.add(null);
  }
  
  @Test
  public void testAdd() {
    Books bookList = new Books();
    LightBook book = new LightBook();
    book.setId(42l);
    bookList.add(book);
    assertEquals(1, bookList.size());
    assertEquals(42l, bookList.get(0).getId().longValue());
  }
  
  @Test(expected = NullPointerException.class)
  public void testAddAllWithNullBooks() {
    Books bookList = new Books();
    bookList.addAll(null);
  }

  @Test
  public void testAddAll() {
    Books bookListA = new Books();
    LightBook bookA = new LightBook();
    bookA.setId(42l);
    LightBook bookB = new LightBook();
    bookB.setId(41l);
    Books bookListB = new Books();
    bookListB.add(bookB);
    bookListB.add(bookA);
    bookListA.addAll(bookListB);
    assertEquals(2, bookListA.size());
    assertEquals(41l, bookListB.get(0).getId().longValue());
    assertEquals(42l, bookListB.get(1).getId().longValue());
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testRemove() {
    Books bookListA = new Books();
    bookListA.remove(1);
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testRemoveAll() {
    Books bookListA = new Books();
    bookListA.removeAll(new Books());
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testIteratorForRemoval() {
    Books bookList = new Books();
    LightBook book = new LightBook();
    book.setId(42l);
    bookList.add(book);
    Iterator<LightBook> iterator = bookList.iterator();
    while(iterator.hasNext()) {
      iterator.remove();
    }
  }
}
