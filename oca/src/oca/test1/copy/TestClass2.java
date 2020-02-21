package oca.test1.copy;

// Consider the following program...
class A {
  public void ml() {}
}

class B1 extends A {}

class C1 extends B1 {}

class C2 extends B1 {}

public class TestClass2 {
  public static void main(String[] args) {
    C1 c1 = new C1(); // 1
    c1.ml();
    C2 c2 = new C2(); // 1
    c2.ml();

    // What will the following code snippet print?

    Object t = new Integer(107);
    int k = (Integer) t.intValue() / 9;
    System.out.println(k);
  }
}
