package oca.test2;

class MyException extends Throwable {}

class MyException1 extends MyException {}

class MyException2 extends MyException {}

class MyException3 extends MyException2 {}

public class ExceptionTest {
  void myMethod() throws MyException {

    throw new MyException3();
  }

  static int mx(int s) {
    for (int i = 0; i < 3; i++) {
      s = s + i;
    }
    return s;
  }

  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();

    int s = 5;
    s += s + mx(s) + ++s;
    System.out.println(new Boolean("true").equals(Boolean.TRUE));
  }
}
