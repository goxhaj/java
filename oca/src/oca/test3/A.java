package oca.test3;

import java.io.IOException;

public class A {
  public static void main(String[] args) throws IOException {
    System.out.println("HEllo world".compareTo("Hello world"));
    System.out.println(new A().main);
    String s = 'b' + 63 + "a";
    System.out.println('a' + 1);
  }

  int main;
}
