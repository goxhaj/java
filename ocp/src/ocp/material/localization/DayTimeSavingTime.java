package ocp.material.localization;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DayTimeSavingTime {

  public static void main(String[] args) {

    LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
    ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));

    LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
    ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
    long x = ChronoUnit.HOURS.between(zd1, zd2);
    System.out.println(zd1);
    System.out.println(zd2);
    System.out.println(x);
  }
}
