package ocp.material.concurrency;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

public class ParallelStreams2 {

  public static void main(String[] args) {
    // System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().skip(5).findAny());
    // System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).parallelStream().skip(5).findAny());

    System.out.println(
        Arrays.asList(1, 2, 3, 4, 5, 6)
            .parallelStream()
            .reduce(0, (a, b) -> (a - b))); // NOT AN ASSOCIATIVE ACCUMULATOR

    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
    SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
    System.out.println(set); // [f, l, o, w]
  }
}
