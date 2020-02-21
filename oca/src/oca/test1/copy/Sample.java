package oca.test1.copy;

import java.util.ArrayList;
import java.util.List;

// Consider the following class and interface definitions (in separate files):

public class Sample implements IInt {
  public static void main(String[] args) {
    Sample s = new Sample(); // 1
    int j = s.thevalue; // 2
    int k = IInt.thevalue; // 3
    int l = thevalue; // 4
    List s1 = new ArrayList();
    s1.add("a");
    s1.add("b");
    s1.add(1, "c"); // a c
    List s2 = new ArrayList(s1.subList(1, 1));
    s1.addAll(s2);
    System.out.println(s1);
  }
}

interface IInt {
  int thevalue = 0;
}

// What will happen when the above code is compiled and run?
