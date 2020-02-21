package oca.material;

public class Discounter {
  static final double percent = 0; // 1
  int offset = 10, base = 50; // 2

  public static double calc(double value) {
    int a = 5, b = 7, k = 0;

    k = new Integer(a) + new Integer(b);
    int coupon, offset, base; // 3
    if (percent < 10) { // 4
      coupon = 15;
      offset = 20;
      base = 10;
    }
    return coupon * offset * base * value / 100; // 5
  }

  public static void main(String[] args) {
    System.out.println(calc(100));
    StringBuilder sb = new StringBuilder("12345678");
    sb.setLength(5);
  }
}
