package oca.material;

import java.io.IOException;

public class Test {

  public static void main(String[] args) {
    System.out.print("a");
    try {
      System.out.print("b");
      throw new IllegalArgumentException();
    } catch (IllegalArgumentException e) {
      System.out.print("c");
      throw new RuntimeException("1");
    } catch (RuntimeException e) {
      System.out.print("d");
      throw new RuntimeException("2");
    } finally {
      System.out.print("e");
    }
  }

  public void ohNo() throws IOException {
    System.out.println("it's ok");
    throw new IllegalArgumentException();
  }

  public static Exception a() {
    return new Exception();
  }
}
