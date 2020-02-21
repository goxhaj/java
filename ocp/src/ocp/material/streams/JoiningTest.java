package ocp.material.streams;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningTest {

  public static void main(String[] args) {
    ConcurrentHashMap m;
    Stream<String> ss = Stream.of("a", "b", "c");
    String str = ss.collect(Collectors.joining(",", "-", "+"));
    System.out.println(str);
  }
}
