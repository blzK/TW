package fr.upem.m2.tw.mlvbooks.objects.beans;

import static org.junit.Assert.assertEquals;

import java.util.Map.Entry;

import org.junit.Test;

public class BookMapTest {

  @Test(expected = IllegalArgumentException.class)
  public void testPutWithInvalidBook1() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setId(42l);
    map.put(book, 42);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testPutWithInvalidBook2() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setPrice(42.0);
    map.put(book, 42);
  }
  
  @Test(expected = NullPointerException.class)
  public void testPutWithNullValue() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setId(42l);
    book.setPrice(42.0);
    map.put(book, null);
  }

  @Test
  public void testPut() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setId(42l);
    book.setPrice(42.0);
    map.put(book, 42);
  }
  
  @Test
  public void testContainsKey() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setId(42l);
    book.setPrice(42.0);
    map.put(book, 42);
    assertEquals(true, map.containsKey(book));
    LightBook bookB = new LightBook();
    bookB.setId(43l);
    bookB.setPrice(42.0);
    assertEquals(false, map.containsKey(bookB));
  }
  
  @Test
  public void testGet() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setId(42l);
    book.setPrice(42.0);
    map.put(book, 42);
    assertEquals(new Integer(42), map.get(book));
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testRemove() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    map.remove(book);
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testClear() {
    BookMap map = new BookMap();
    map.clear();
  }
  
  @Test(expected = UnsupportedOperationException.class)
  public void testEntrySet() {
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    map.remove(book);
    map.put(book, 42);
    map.entrySet().add(new Entry<LightBook, Integer>() {
      
      @Override
      public Integer setValue(Integer value) {
        return null;
      }
      
      @Override
      public Integer getValue() {
        return null;
      }
      
      @Override
      public LightBook getKey() {
        return null;
      }
    });
    map.entrySet().remove(book);
  }
}
