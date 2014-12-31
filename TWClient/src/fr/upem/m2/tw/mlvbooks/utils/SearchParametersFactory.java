package fr.upem.m2.tw.mlvbooks.utils;

import java.util.Map;
import java.util.Objects;

import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

public final class SearchParametersFactory {
  private SearchParametersFactory() {}
  
  public static SearchParametersDTO createSearchParametersDTO(
      Map<String, String[]> parameters) {
    Objects.requireNonNull(parameters);
    SearchParametersDTO searchParametersDTO = new SearchParametersDTO();
    if (!parameters.get("title")[0].isEmpty()) {
      searchParametersDTO.setTitle(parameters.get("title")[0]);
    }
    if (!parameters.get("author")[0].isEmpty()) {
      searchParametersDTO.setAuthor(parameters.get("author")[0]);
    }
    if (!parameters.get("isbn")[0].isEmpty()) {
      searchParametersDTO.setISBN(parameters.get("isbn")[0]);
    }
    return searchParametersDTO;
  }
}
