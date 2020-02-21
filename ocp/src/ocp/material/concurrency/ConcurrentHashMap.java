package ocp.material.concurrency;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcurrentHashMap implements Serializable {

  public static void main(String[] args) {

    ObjectOutputStream o;
    Map<String, Object> foodData = new java.util.concurrent.ConcurrentHashMap<String, Object>();
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    System.out.println("Before: " + foodData);

    for (String key : foodData.keySet()) foodData.remove(key);

    System.out.println("After: " + foodData);

    Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, String> map =
        ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
    System.out.println(map); // {5=lions,bears, 6=tigers}
    System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, List<String>> map2 =
        ohMy2.collect(Collectors.groupingByConcurrent(String::length));
    System.out.println(map2); // {5=[lions, bears], 6=[tigers]}
  }
}
