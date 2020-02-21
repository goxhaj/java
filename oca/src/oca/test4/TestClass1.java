package oca.test4;

public class TestClass1 {
  public static void main(String[] args) {
    new TestClass1().sayHello();
  } // 1

  public static void sayHello() {
    System.out.println("Static Hello World");
  } // 2

  public void sayHello() {
    System.out.println("Hello World ");
  } // 3
}
