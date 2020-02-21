package oca.test3;

public class Discounter {
  double percent = 0; // 1
  int offset = 10, base = 50; // 2

  public double calc(double value) {
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
  }
}
