package oca.material;

import java.sql.Timestamp;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeConverterDemo {
  static final DateTimeFormatter formatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss.SSSSSS");

  public static void main(String[] args) {
    String str = "2017-05-12-14.57.43.881856";
    Timestamp ts = null;
    try {

      ts = Timestamp.valueOf(LocalDateTime.parse(str, formatter));
    } catch (DateTimeException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(ts);
  }
}
