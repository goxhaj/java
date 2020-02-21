package oca.material;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo {

  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    date.plusDays(10);
    System.out.println(date);

    LocalDate date2 = LocalDate.of(2014, Month.JANUARY, 20);
    System.out.println(date2); // 2014-01-20
    date2 = date2.plusDays(2);
    System.out.println(date2);
  }
}
