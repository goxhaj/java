package ocp.material.concurrency;

import java.util.concurrent.CyclicBarrier;

public class Test extends Thread {
  static volatile int x, y;
  static Object obj = new Object();

  @Override
  public void run() {
    for (; x < 10 && y < 10; ) {

      synchronized (obj) {
        x++;
        y++;
        System.out.println(x + " " + y);
      }
    }
  }

  public static void main(String[] args) {
    new Test().start();
    new Test().start();
    final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean!")); //
  }
}
