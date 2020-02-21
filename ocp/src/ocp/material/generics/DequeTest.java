package ocp.material.generics;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

  public static void main(String[] args) {

    Deque<Integer> d = new ArrayDeque<>();
    d.add(1);
    d.addFirst(2);
    d.pop();
    d.offerFirst(3);
  }
}
