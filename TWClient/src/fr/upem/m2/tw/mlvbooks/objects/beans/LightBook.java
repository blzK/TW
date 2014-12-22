package fr.upem.m2.tw.mlvbooks.objects.beans;

import java.io.Serializable;

/**
 * 
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class LightBook implements Serializable {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -8227341757529334726L;
  private String title;
  private String author;
  private Double price;

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
