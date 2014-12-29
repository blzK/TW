package fr.upem.m2.tw.mlvbooks.objects.dto;

public interface BookDTO {
	
	public Long getId();
	
	public void setId(Long id);
	
	public String getTitle();
	
	public void setTitle(String title);
	
	public String getAuthor();
	
	public void setAuthor(String author);
	
	public Double getPrice();
	
	public void setPrice(Double price);

}
