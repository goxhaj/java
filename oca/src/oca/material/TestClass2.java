package oca.material;

// Filename: TestClass.java
class TestClass2 implements T1, T2 {

  @Override
  public void m1() {
    // TODO Auto-generated method stub

  }
}

interface T1 {
  int VALUE = 1;

  void m1();
}

interface T2 {
  int VALUE = 2;

  void m1();
}
