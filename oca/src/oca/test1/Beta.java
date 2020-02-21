package oca.test1;

// What will the following code print when run?

class Baap {
  public int h = 4;

  public int getH() {
    System.out.println("Baap " + h);
    return h;
  }
}

public class Beta extends Baap {
  public int h = 44;

  @Override
  public int getH() {
    System.out.println("Beta " + h);
    return h;
  }

  public static void main(String[] args) {

    Integer i = new Integer(1);
    Long m = new Long(1);
    if (i.equals(m)) System.out.println("equal"); // 1
    else System.out.println("not equal");

    Baap b = new Beta();
    System.out.println(b.h + " " + b.getH());
    Beta bb = (Beta) b;
    System.out.println(bb.h + " " + bb.getH());
  }
}
