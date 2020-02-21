package ocp.material.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class GenericsExample {

  class A {}

  class B extends A {}

  class D extends A {}

  class C extends B {}

  public static void main(String[] args) {
    List<? super C> list = new ArrayList<B>();
    List<? extends A> list2 = new ArrayList<B>();

    BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");
    favorites.put("Tom", "Tram");

    Map<String, String> map = new HashMap<>();
    BiConsumer<String, String> b1 = map::put;

    b1.accept("a", "a");
    b1.accept("a", "b");

    System.out.println(map);

    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();
    System.out.println(p1.test(""));
    System.out.println(p2.test(""));

    String jenny = favorites.merge("Jenny", "Skyride", mapper);
    String tom = favorites.merge("Tom", "Skyride", mapper);

    System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
    System.out.println(jenny); // Bus Tour
    System.out.println(tom); // Skyride
  }
}
