package ocp.material.concurrency;

class A extends Thread {
  protected static int i = 0;

  @Override
  public void run() {
    for (; i < 5; i++) System.out.println("Hello");
  }
}

public class TestClass extends A {

  @Override
  public void run() {
    for (; i < 5; i++) System.out.println("World");
  }

  public static void main(String args[]) {
    Thread t1 = new A();
    Thread t2 = new TestClass();
    t2.start();
    t1.start();
  }
}
