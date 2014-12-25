package fr.upem.m2.tw.mlvbooks.objects.dto;

import java.io.Serializable;

/**
 * 
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class LightBookDTO implements Serializable {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -7017043037913205922L;
  private Long id;
  private String title;
  private String author;
  private Double price;

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
}
