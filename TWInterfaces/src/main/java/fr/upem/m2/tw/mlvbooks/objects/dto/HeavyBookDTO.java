package fr.upem.m2.tw.mlvbooks.objects.dto;

import java.io.Serializable;

public class HeavyBookDTO implements Serializable, BookDTO {
  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -9056255495859978430L;
  private Long id;
  private String title;
  private String author;
  private Double price;
  private String ISBN;
  private Integer numberOfPages;
  private String synopsis;

  public HeavyBookDTO() {
  }
  
  public HeavyBookDTO(Long id, String title, String author) {
  	this.id = id;
  	this.title = title;
  	this.author = author;
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  public String getISBN() {
    return ISBN;
  }
  public void setISBN(String iSBN) {
    ISBN = iSBN;
  }
  public Integer getNumberOfPages() {
    return numberOfPages;
  }
  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }
  public String getSynopsis() {
    return synopsis;
  }
  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    return prime + ((id == null) ? 0 : id.hashCode());
  }
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    HeavyBookDTO other = (HeavyBookDTO) obj;
    return other.id == id;
  }
}
