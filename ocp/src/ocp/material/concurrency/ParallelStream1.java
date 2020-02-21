package ocp.material.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelStream1 {

  public static void main(String[] args) {
    List<Integer> data = Collections.synchronizedList(new ArrayList<>());
    Arrays.asList(1, 2, 3, 4, 5, 6)
        .parallelStream()
        .map(
            i -> {
              System.out.println("*" + i + "*");
              data.add(i);
              return i;
            }) // AVOID STATEFUL LAMBDA EXPRESSIONS!
        .forEachOrdered(i -> System.out.print(i + " "));
    System.out.println();
    for (Integer e : data) {
      System.out.print(e + " ");
    }
  }
}
