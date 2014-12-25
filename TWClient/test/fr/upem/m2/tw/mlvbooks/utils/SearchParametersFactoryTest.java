package fr.upem.m2.tw.mlvbooks.utils;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

public class SearchParametersFactoryTest {

  @Test(expected = NullPointerException.class)
  public void testCreateSearchParametersDTOWithNullParameterMap() {
    SearchParametersFactory.createSearchParametersDTO(null);
  }
  
  @Test
  public void testCreateSearchParametersDTO() {
    SearchParametersDTO expected = new SearchParametersDTO();
    expected.setAuthor("author");
    expected.setEndingPrice(42);
    expected.setStartingPrice(1);
    expected.setISBN("42-42-42");
    expected.setTitle("title");
    expected.setAllParameters(null);
    Map<String, String[]> parameterMap = new HashMap<>();
    parameterMap.put("author", new String[] {"author"});
    parameterMap.put("title", new String[] {"title"});
    parameterMap.put("isbn", new String[] {"42-42-42"});
    parameterMap.put("all-criteria", new String[] {""});
    parameterMap.put("ending-price", new String[] {"42"});
    parameterMap.put("starting-price", new String[] {"1"});
    SearchParametersDTO received = 
        SearchParametersFactory.createSearchParametersDTO(parameterMap);
    assertEquals(expected.getAllParameters(), received.getAllParameters());
    assertEquals(expected.getAuthor(), received.getAuthor());
    assertEquals(expected.getEndingPrice(), received.getEndingPrice());
    assertEquals(expected.getISBN(), received.getISBN());
    assertEquals(expected.getStartingPrice(), received.getStartingPrice());
    assertEquals(expected.getTitle(), received.getTitle());
  }
}
