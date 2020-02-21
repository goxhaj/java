package oca.test1.copy;

// What will be the result of attempting to compile and run the following program?

public class TestClass1 {

  public static int[] getArray() {
    return null;
  }

  public Object myMethod() {
    return new Integer("1");
  }

  public static void main(String args[]) {
    A o1 = new C();
    C o2 = (C) o1;
    // System.out.println(o1.m1());
    // System.out.println(o2.i + o2.x);

    int index = 1;
    try {
      getArray()[index = 2]++;
    } catch (Exception e) {
    } // empty catch
    System.out.println("index = " + index);
  }

  class A {
    int i = 10;

    int m1() {
      return i;
    }
  }

  class B extends A {
    int i = 20;

    @Override
    int m1() {
      return i;
    }
  }

  class C extends B {
    int i = 30;
    int x = 10;

    @Override
    int m1() {
      return i;
    }
  }
}
