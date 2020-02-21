package ocp.material.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Computation1 implements Runnable {
  public static int product = 0;

  @Override
  public void run() {
    product = 2 * 3;
    try {
      // number of parties waiting at the barrier
      System.out.println(
          "Computation1 -> Number of parties waiting at the barrier "
              + "at this point = "
              + Tester.newBarrier.getNumberWaiting());
      Tester.newBarrier.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }
  }
}

class Computation2 implements Runnable {
  public static int sum = 0;

  @Override
  public void run() {
    // check if newBarrier is broken or not
    System.out.println("Is the barrier broken? - " + Tester.newBarrier.isBroken());
    sum = 10 + 20;
    try {

      // number of parties waiting at the barrier
      System.out.println(
          "Computation2 -> Number of parties waiting at the barrier "
              + "at this point = "
              + Tester.newBarrier.getNumberWaiting());

      Tester.newBarrier.await(3000, TimeUnit.MILLISECONDS);

    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    } catch (TimeoutException e) {
      e.printStackTrace();
    }
  }
}

public class Tester implements Runnable {
  public static CyclicBarrier newBarrier = new CyclicBarrier(3);

  public static void main(String[] args) {
    // parent thread
    Tester test = new Tester();

    Thread t1 = new Thread(test);
    t1.start();
  }

  @Override
  public void run() {
    System.out.println(
        "Number of parties required to trip the barrier = " + newBarrier.getParties());
    System.out.println("Sum of product and sum = " + (Computation1.product + Computation2.sum));

    // objects on which the child thread has to run
    Computation2 comp2 = new Computation2();
    Computation1 comp1 = new Computation1();

    // creation of child thread
    Thread t1 = new Thread(comp1);
    Thread t2 = new Thread(comp2);

    // moving child thread to runnable state
    t1.start();
    t2.start();

    try {
      Tester.newBarrier.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }

    // barrier breaks as the number of thread waiting for the barrier
    // at this point = 3
    System.out.println("Sum of product and sum = " + (Computation1.product + Computation2.sum));

    // Resetting the newBarrier
    newBarrier.reset();
    System.out.println("Barrier reset successful");
  }
}
