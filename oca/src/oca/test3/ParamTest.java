package oca.test3;

public class ParamTest {

  public static void printSum(double a, double b) {
    System.out.println("In double " + (a + b));
  }

  public static void printSum(float a, float b) {
    System.out.println("In float " + (a + b));
  }

  public static void main(String[] args) {
    Float a = Float.NaN;
    a = Float.valueOf("0.1").floatValue();

    printSum(1.0, 2.0);
  }

  public float parseFloat(String s) {
    float f = 0.0f;
    try {
      f = Float.valueOf(s).floatValue();
      return f;
    } catch (NumberFormatException nfe) {
      System.out.println("Invalid input " + s);
      f = Float.NaN;
      return f;
    } finally {
      System.out.println("finally");
    }
    return f;
  }
}
