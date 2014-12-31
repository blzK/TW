package fr.upem.m2.tw.mlvbooks.utils;

import java.util.Arrays;
import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.beans.Cart;
import fr.upem.m2.tw.mlvbooks.objects.beans.LightBook;

/**
 * A cart builder.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public final class CartFactory {
  private CartFactory() {}
  
  public static Cart getCart(String ids) {
    Cart bookMap = new Cart();
    CharSequence idSequence = ids.subSequence(1, ids.length() - 1);
    List<String> idList = Arrays.asList(idSequence.toString().split(","));
    for (String id : idList) {
      LightBook book = new LightBook();
      book.setId(Long.parseLong(id));
      book.setPrice(Double.parseDouble(id));
      book.setTitle(id);
      bookMap.put(
          book, 
          bookMap.containsKey(book) ? bookMap.get(book) + 1 : 1);
      // search for the book
      // map it with dozer
      // if it already exists, just increment the quantity
      // else put it in the book map
    }
    return bookMap;
  }
}
