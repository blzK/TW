package fr.upem.m2.tw.mlvbooks.utils;

import java.util.Arrays;
import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.beans.BookMap;
import fr.upem.m2.tw.mlvbooks.objects.beans.Cart;

/**
 * A cart builder.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public final class CartBuilder {
  private CartBuilder() {}
  
  public static Cart getCart(String ids) {
    BookMap bookMap = new BookMap();
    ids.subSequence(1, ids.length() - 1);
    List<String> idList = Arrays.asList(ids.split(","));
    for (String id : idList) {
      // search for the book
      // map it with dozer
      // if it already exists, just increment the quantity
      // else put it in the book map
    }
    Cart cart = new Cart();
    cart.setBooks(bookMap);
    return cart;
  }
}
