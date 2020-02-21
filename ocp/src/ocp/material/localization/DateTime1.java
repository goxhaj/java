package ocp.material.localization;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTime1 {

  static LocalTime one = LocalTime.of(5, 15);
  static LocalTime two = LocalTime.of(6, 30);
  static LocalDate date = LocalDate.of(2016, 1, 20);

  public static void main(String[] args) {
    System.out.println(ChronoUnit.HOURS.between(one, two));

    Instant instant = Instant.ofEpochSecond(10);
    System.out.println(instant);
  }
}
