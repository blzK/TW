package fr.upem.m2.tw.mlvbooks.utils;

import java.util.Map;

import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

public final class SearchParametersFactory {
  private SearchParametersFactory() {}
  
  public static SearchParametersDTO createSearchParametersDTO(
      Map<String, String[]> parameters) {
    SearchParametersDTO searchParametersDTO = new SearchParametersDTO();
    if (!parameters.get("all-criteria")[0].isEmpty()) {
      searchParametersDTO.setAllParameters(parameters.get("all-criteria")[0]);
    }
    if (!parameters.get("title")[0].isEmpty()) {
      searchParametersDTO.setTitle(parameters.get("title")[0]);
    }
    if (!parameters.get("author")[0].isEmpty()) {
      searchParametersDTO.setAuthor(parameters.get("author")[0]);
    }
    if (!parameters.get("isbn")[0].isEmpty()) {
      searchParametersDTO.setISBN(parameters.get("isbn")[0]);
    }
    if (!parameters.get("starting-price")[0].isEmpty()) {
      searchParametersDTO.setStartingPrice(
          Integer.parseInt(parameters.get("starting-price")[0]));
    }
    if (!parameters.get("ending-price")[0].isEmpty()) {
      searchParametersDTO.setEndingPrice(
          Integer.parseInt(parameters.get("ending-price")[0]));
    }
    return searchParametersDTO;
  }
}
