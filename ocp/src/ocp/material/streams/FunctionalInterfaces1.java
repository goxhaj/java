package ocp.material.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class FunctionalInterfaces1 {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    BiConsumer<String, String> b1 = map::put;

    b1.accept("a", "a");
    b1.accept("a", "b");

    System.out.println(map);

    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();
    System.out.println(p1.test(""));
    System.out.println(p2.test(""));
  }
}
