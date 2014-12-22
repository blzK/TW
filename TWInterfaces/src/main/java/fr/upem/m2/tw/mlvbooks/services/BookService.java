package fr.upem.m2.tw.mlvbooks.services;

import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.dto.HeavyBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.LightBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

public interface BookService {
  public List<LightBookDTO> getBooks(SearchParametersDTO searchParametersDTO);
  public HeavyBookDTO getBook(String ISBN);
}
