package ocp.material.localization;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Zoned {

  public static void main(String[] args) {
    /*    LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
    LocalTime time = LocalTime.of(1, 30);
    ZoneId zone = ZoneId.of("US/Eastern");
    ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
    ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
    long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
    int clock1 = dateTime1.getHour();
    int clock2 = dateTime2.getHour();
    System.out.println(hours + "," + clock1 + "," + clock2);*/

    String m1 = Duration.of(60, ChronoUnit.MINUTES).toString();
    String m2 = Duration.ofMinutes(1).toString();
    String s = Duration.of(70, ChronoUnit.SECONDS).toString();
    String d = Duration.ofDays(1).toString();
    String p = Period.ofDays(1).toString();

    System.out.println(m1 + ", " + m2 + ", " + s + ", " + d + ", " + p);
  }
}
