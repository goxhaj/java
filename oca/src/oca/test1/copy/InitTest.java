package oca.test1.copy;

public class InitTest {

  int million2 = 1000_000;

  public InitTest() {
    s1 = sM1("1");
  }

  static String s1 = sM1("a");
  static String s3 = sM1("2");
  static String s4 = sM1("2");

  {
    s1 = sM1("3");
  }

  static {
    s1 = sM1("b");
  }

  static String s2 = sM1("c");

  public static void main(String args[]) {
    s1 = s2 = s3 = s4 = "Ardi";
    System.out.println("s1: " + s1);
    Long.valueOf("123").longValue();
    InitTest it = new InitTest();
  }

  private static String sM1(String s) {
    System.out.println(s);
    return s;
  }
}
