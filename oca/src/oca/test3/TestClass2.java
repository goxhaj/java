package oca.test3;

public class TestClass2 {
  static char a;

  public static void main(String args[]) {

    int i = 1;
    int j = i++;
    if ((i == ++j) | (i++ == j)) {
      i += j;
    }
    // System.out.println(i);

    System.out.println(a); // 1
  }
}
