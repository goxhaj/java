package ocp.material.localization;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class String1 {

  public static void main(String[] args) {
    //    String s = "abcde ";
    //    System.out.println(s.trim().length()); // 5
    //    System.out.println(s.charAt(4)); // e
    //    System.out.println(s.indexOf('e')); // 4
    //    System.out.println(s.indexOf("de")); // 3
    //    System.out.println(s.substring(2, 4).toUpperCase()); // CD
    //    System.out.println(s.replace('a', '1')); // 1bcde
    //    System.out.println(s);
    //    System.out.println(s.contains("DE")); // false
    //    System.out.println(s.startsWith("a"));

    StringBuilder s = new StringBuilder("abcde");
    s.insert(1, '-').delete(3, 4);
    System.out.println(s); // a-bde
    System.out.println(s.substring(2, 4)); // bd

    StringBuilder s1 = new StringBuilder("12345");
    s1.delete(1, 2);
    System.out.println(s1);

    Locale locale = Locale.getDefault();
    System.out.println(locale);

    Locale l1 = new Locale.Builder().setLanguage("bb").setRegion("BB").build();
    System.out.println(l1);

    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);

    double price = 48;
    NumberFormat us = NumberFormat.getCurrencyInstance();
    System.out.println(us.format(price));
  }
}
