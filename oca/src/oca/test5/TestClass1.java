package oca.test5;

class MyException extends Exception {}

public class TestClass1 {
  public boolean out1() {
    return true;
  }

  public boolean out2() {
    return true;
  }

  public static void main(String[] args) {
    TestClass1 tc = new TestClass1();
    short s = 9;
    Integer i = 9;
    System.out.println(s == i);

    System.out.println(i < 20 ? tc.out1() : tc.out2());

    try {
      tc.m1();
    } catch (MyException e) {
      //
    } finally {
      tc.m2();
    }
  }

  public void m1() throws MyException {
    throw new MyException();
  }

  public void m2() throws RuntimeException {
    throw new NullPointerException();
  }
}
