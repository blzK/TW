package fr.upem.m2.tw.mlvbooks.objects.beans;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

  @Test(expected = NullPointerException.class)
  public void testSetNullBooks() {
    Cart cart = new Cart();
    cart.setBooks(null);
  }

  @Test
  public void testSetBooks() {
    Cart cart = new Cart();
    cart.setBooks(new BookMap());
  }
  
  @Test
  public void testGetTotalPrice() {
    Cart cart = new Cart();
    BookMap map = new BookMap();
    LightBook book = new LightBook();
    book.setId(1l);
    book.setPrice(1.0);
    map.put(book, 42);
    cart.setBooks(map);
    assertEquals(42.0,cart.getTotalPrice(), 0.0);
  }
}
