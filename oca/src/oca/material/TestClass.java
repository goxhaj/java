package oca.material;

public class TestClass {
  public static Integer wiggler(Integer x) {
    Integer y = x + 10;
    x++;
    // System.out.println(x);
    return y;
  }

  public static void main(String[] args) {
    float f = 0x324;
    char c = 320;
    double side = 0;
    long l = 07;

    Object t = new Integer(107);
    int k = (((Integer) t).intValue()) / 9;
    // System.out.println(k);

    StringBuilder b1 = new StringBuilder("snorkler");
    StringBuilder b2 = new StringBuilder("yoodler");
    b2.substring(4);

    System.out.println(b2.append(false));
  }
}
