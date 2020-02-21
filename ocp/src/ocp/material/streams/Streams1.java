package ocp.material.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {

  public static void main(String[] args) {
    List<String> cats = new ArrayList<>();
    cats.add("Annie");
    cats.add("Ripley");

    Stream<String> stream = cats.stream();
    cats.add("KC");
    System.out.println(stream.count());
    cats.add("AB");
  }
}
