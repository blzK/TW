package fr.upem.m2.tw.mlvbooks.services;

import java.util.List;

import fr.upem.m2.tw.mlvbooks.objects.dto.HeavyBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.LightBookDTO;
import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;

public interface BookService {
  public LightBookDTO getLightBook(Long id);
  public List<LightBookDTO> getBooks(SearchParametersDTO searchParametersDTO);
  public HeavyBookDTO getBook(Long id);
}
