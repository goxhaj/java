package ocp.material.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {

  public static void main(String[] args) {

    List<A> listA = new ArrayList<>();
    listA.add(new A());
    print(listA);

    List<B> listB = new ArrayList<>();
    listB.add(new B());
    print(listB);

    List<C> listC = new ArrayList<>();
    listC.add(new C());
    print(listC);
  }

  public static void print(List<? extends A> list) {
    for (A a : list) {
      System.out.println(a.getClass());
    }
  }

  static class A {}

  static class B extends A {}

  static class C extends B {}
}
