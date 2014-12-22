package fr.upem.m2.tw.mlvbooks.objects.dto;

/**
 * 
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class SearchParametersDTO {
  private String allParameters;
  private String title;
  private String author;
  private String ISBN;
  private Integer startingPrice;
  private Integer endingPrice;

  public String getAllParameters() {
    return allParameters;
  }
  public void setAllParameters(String allParameters) {
    this.allParameters = allParameters;
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
  public String getISBN() {
    return ISBN;
  }
  public void setISBN(String iSBN) {
    ISBN = iSBN;
  }
  public Integer getStartingPrice() {
    return startingPrice;
  }
  public void setStartingPrice(Integer startingPrice) {
    this.startingPrice = startingPrice;
  }
  public Integer getEndingPrice() {
    return endingPrice;
  }
  public void setEndingPrice(Integer endingPrice) {
    this.endingPrice = endingPrice;
  }
}
