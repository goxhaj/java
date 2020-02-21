package oca.material;

public class Sample implements IInt {
  static char x;

  public static void main(String[] args) {
    Sample s = new Sample(); // 1
    int j = s.thevalue; // 2
    int k = IInt.thevalue; // 3
    int l = thevalue; // 4

    int a = Integer.MIN_VALUE;
    int b = -a;
    int c = -b;
    // System.out.println(a + "   " + b + "  " + c);
    System.out.println("x=" + (int) x + "");
  }

  public static long main1(String[] args) {
    System.out.println("Hello");
    return 10L;
  }
}

interface IInt {
  int thevalue = 0;
}
