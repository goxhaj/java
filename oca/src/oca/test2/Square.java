package oca.test2;

public class Square {
  private double side = 0; // LINE 2

  public static void main(String[] args) { // LINE 4
    String a = "a";
    a.concat("test");
    Square sq = new Square(); // LINE 5
    sq.side = 10; // LINE 6
    Long ln = new Long(42);

    int i = 0;
    loop: // 1
    {
      System.out.println("Loop Lable line");
      try {
        for (; true; i++) {
          if (i > 5) break loop; // 2
        }
      } catch (Exception e) {
        System.out.println("Exception in loop.");
      } finally {
        System.out.println("In Finally"); // 3
      }
    }

    if (ln.equals(Long.parseLong("42"))) {
      System.out.println("true");
    }
  }
}
