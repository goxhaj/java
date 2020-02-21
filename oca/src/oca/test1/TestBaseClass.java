package oca.test1;

class Base {

  public Object getValue() {
    return new Object();
  } // 1
}

class Base2 extends Base {
  static int y = 10;

  @Override
  public String getValue() {
    return "hello";
  } // 2
}

public class TestBaseClass {
  public static void main(String[] args) {
    Base b = new Base2();
    System.out.println(b.getValue() + "" + new Base2().y); // 3

    String str1 = "one";
    String str2 = "two";
    System.out.println(str1.equals(str1 = str2));
  }

  abstract class Calculator {
    abstract void calculate();

    public void main(String[] args) {
      System.out.println("calculating");
      Calculator x = null;
      x.calculate();
    }
  }
}
