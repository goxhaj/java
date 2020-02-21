package oca.material;

public class TestError {

  public static void methodX() throws Exception {
    throw new AssertionError();
  }

  public static void main(String[] args) {
    try {
      methodX();
    } catch (Exception e) {
      System.out.println("EXCEPTION");
    }
  }
}
