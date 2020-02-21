package oca.material;

public class TestClass123 {

  public static void main(String[] args) {
    java.time.LocalDate dt =
        java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
    System.out.println(dt);
  }
}
