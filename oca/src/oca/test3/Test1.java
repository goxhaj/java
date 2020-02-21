package oca.test3;

import java.util.ArrayList;
import java.util.List;

class Test1 {
  public static void main(String[] args) {
    int i = 4;
    int ia[][][] = new int[i][i = 3][i];
    System.out.println(ia.length + ", " + ia[0].length + ", " + ia[0][0].length);

    List s1 = new ArrayList();
    try {
      while (true) {
        s1.add("sdfa");
      }
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
    System.out.println(s1.size());
  }
}
