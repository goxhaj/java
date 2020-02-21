package ocp.material.advanceclassdesign;

public class Enclosing {

  private int a = 5;

  private static void print() {
    Nested nested = new Nested();
    System.out.println(nested.price);
  }

  private static class Nested {
    private int price = 6;
  }

  public static void main(String[] args) {
    Enclosing.Nested nestedT = new Enclosing.Nested();
    Nested nested = new Nested();
    System.out.println(new Enclosing().a);
    System.out.println(new Enclosing().a);
  }
}
