package fr.upem.m2.tw.mlvbooks.objects.beans;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class BookListTest {

  @Test(expected = NullPointerException.class)
  public void testAddWithNullBook() {
    BookList bookList = new BookList();
    bookList.add(null);
  }
  
  @Test
  public void testAdd() {
    BookList bookList = new BookList();
    LightBook book = new LightBook();
    book.setId(42l);
    bookList.add(book);
    assertEquals(1, bookList.size());
    assertEquals(42l, bookList.get(0).getId().longValue());
  }
  
  @Test(expected = NullPointerException.class)
  public void testAddAllWithNullBooks() {
    BookList bookList = new BookList();
    bookList.addAll(null);
  }

  @Test
  public void testAddAll() {
    BookList bookListA = new BookList();
    LightBook bookA = new LightBook();
    bookA.setId(42l);
    LightBook bookB = new LightBook();
    bookB.setId(41l);
    BookList bookListB = new BookList();
    bookListB.add(bookB);
    bookListB.add(bookA);
    bookListA.addAll(bookListB);
    assertEquals(2, bookListA.size());
    assertEquals(41l, bookListB.get(0).getId().longValue());
    assertEquals(42l, bookListB.get(1).getId().longValue());
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testRemove() {
    BookList bookListA = new BookList();
    bookListA.remove(1);
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testRemoveAll() {
    BookList bookListA = new BookList();
    bookListA.removeAll(new BookList());
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testIteratorForRemoval() {
    BookList bookList = new BookList();
    LightBook book = new LightBook();
    book.setId(42l);
    bookList.add(book);
    Iterator<LightBook> iterator = bookList.iterator();
    while(iterator.hasNext()) {
      iterator.remove();
    }
  }
}
