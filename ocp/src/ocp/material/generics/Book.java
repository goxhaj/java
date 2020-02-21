package ocp.material.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Book {

  String isbn;
  String title;

  public Book(String isbn, String title) {
    this.isbn = isbn;
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    StringBuilder val2 = new StringBuilder("world");

    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public static void main(String[] args) {

    List<Book> books = Arrays.asList(new Book("aaa", "aaa"), new Book("bbb", "bbb"));
    Stream<Book> t = books.stream().sorted();
    books
        .stream()
        .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
        .forEach(b -> System.out.println(b.getIsbn())); // 1
  }
}
