package oca.test1;

// What happens when you try to compile and run the following program?
public class CastTest {
  public static void main(String args[]) {
    byte b = -128;
    int i = b;
    b = (byte) i;
    System.out.println(i + " " + b);
  }
}
