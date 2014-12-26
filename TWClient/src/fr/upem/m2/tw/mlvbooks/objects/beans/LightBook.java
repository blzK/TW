package fr.upem.m2.tw.mlvbooks.objects.beans;

import java.io.Serializable;

/**
 * A "lightweight" book class. Its sole purpose is to be used as a list element.
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class LightBook implements Serializable {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -8227341757529334726L;
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
    LightBook other = (LightBook) obj;
    return other.id == id;
  }
}
