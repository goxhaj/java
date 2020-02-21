package ocp.material.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

  public static void main(String[] args) {

    List<? super B> exceptions = new ArrayList<>();
    List<String> string = new ArrayList<>();

    List<String> list = new ArrayList<>();
    list.add("A");
    List<? extends String> list2 = new ArrayList<>();
    String test = list2.get(0);
    list.addAll(list2);

    exceptions.add(new B());
    exceptions.add(new C());

    List<Object> listA = new ArrayList<>();
    listA.add(new Object());
    listA.add(new A());
    print(listA);
  }

  public static void print(List<? super B> list) {
    list.add(new B());
    list.add(new C());
    System.out.println(list);
  }

  static class A {}

  static class B extends A {}

  static class C extends B {}
}
