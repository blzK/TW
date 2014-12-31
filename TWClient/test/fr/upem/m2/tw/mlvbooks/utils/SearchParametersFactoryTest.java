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
    expected.setISBN("42-42-42");
    expected.setTitle("title");
    Map<String, String[]> parameterMap = new HashMap<>();
    parameterMap.put("author", new String[] {"author"});
    parameterMap.put("title", new String[] {"title"});
    parameterMap.put("isbn", new String[] {"42-42-42"});
    SearchParametersDTO received = 
        SearchParametersFactory.createSearchParametersDTO(parameterMap);
    assertEquals(expected.getAuthor(), received.getAuthor());
    assertEquals(expected.getISBN(), received.getISBN());
    assertEquals(expected.getTitle(), received.getTitle());
  }
}
