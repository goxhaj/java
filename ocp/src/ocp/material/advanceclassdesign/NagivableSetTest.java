package ocp.material.advanceclassdesign;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NagivableSetTest {

  public static void main(String[] args) {
    NavigableSet<String> myset = new TreeSet<>();
    myset.add("a");
    myset.add("b");
    myset.add("aa");
    myset.add("bb");
    myset.add("c");
    Thread a = new Thread();
    Thread th = new Thread(a);

    // Thread.sleep(1);
    myset.add("cc");
    myset.add("d");
    myset.add("dd");
    System.out.println(myset);
    System.out.println(myset.floor("b"));
    System.out.println(myset.lower("b"));
    System.out.println(myset.higher("c"));
    System.out.println(myset.ceiling("e"));
  }
}
