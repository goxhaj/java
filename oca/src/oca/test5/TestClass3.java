package oca.test5;

// Filename: TestClass.java
class TestClass3 implements T1 {
  int a;

  @Override
  public void m1() {
    a = T1.VALUE;
    a = T1.super.VALUE;
  }

  public static void main() {
    TestClass3 tc = new TestClass3();
  }
}

interface T1 extends T2 {
  int VALUE = 1;

  @Override
  void m1();
}

interface T2 {
  int VALUE = 2;

  void m1();
}
