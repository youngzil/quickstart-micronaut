package org.quickstart.micronaut.gateway;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:24
 */
public class Book {
  private String isbn;
  private String name;
  private Integer stock;

  public Book() {}

  public Book(String isbn, String name) {
    this.isbn = isbn;
    this.name = name;
  }

  public String getIsbn() { return isbn; }

  public void setIsbn(String isbn) { this.isbn = isbn; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public Integer getStock() { return stock; }

  public void setStock(Integer stock) { this.stock = stock; }
}