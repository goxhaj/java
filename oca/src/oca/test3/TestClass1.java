package oca.test3;

public class TestClass1 {
  public static void main(String[] args) throws Exception {

    String ardi = "ardi";
    System.out.println(ardi.charAt(ardi.length()));

    int rate = 10;
    int t = 5;
    long amount = 1000;
    for (int i = 0; i < t; i++) {
      amount = amount * (1 - rate / 100);
    }
  }
}
