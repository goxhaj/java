package oca.material;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
  int numberBags;

  public HelloWorld() {
    this(2);
    System.out.println("Hello");
  };

  public HelloWorld(int numberBags) {
    this.numberBags = numberBags;
  };

  static final void a() {}

  public static void main(String[] args) {

    HelloWorld seed = new HelloWorld();
    System.out.println(seed.numberBags);
    // int i = 1;
    // System.out.println(i++ + ++i + ++i + i++ + ++i);

    // String s1 = "1";
    // String s2 = s1.concat("2");

    // System.out.println(s2.concat("3"));
    // System.out.println(s2);

    // String name = "Fluffy";
    // String name2 = new String("Fluffy");

    // System.out.println(name == name2);

    String start = "AniMaL ";
    String trimmed = start.trim(); // "AniMaL"
    String lowercase = trimmed.toLowerCase(); // "animal"
    String result = lowercase.replace('a', 'A'); // "Animal"
    // System.out.println(Integer.MAX_VALUE + 1);

    StringBuilder sb = new StringBuilder("animals");
    sb.insert(7, "-"); // sb = animals-
    sb.insert(0, "-"); // sb = -animals-
    sb.insert(4, "-"); // sb = -ani-mals
    // System.out.println(sb);

    // String numbers = "012345678";
    // System.out.println(numbers.substring(1, 3));
    // System.out.println(numbers.substring(7, 7));
    // System.out.println(numbers.substring(7));
    // String a = "";
    // a += 'c';

    // System.out.println(a);
    // if (a == "c") System.out.println("==");

    StringBuilder numbers = new StringBuilder("0123456789");
    numbers.delete(2, 8);
    char[] c = new char[2];
    int length = c.length;

    String[] names = {"Tom", "Dick", "Harry"};
    // List<String> list = names;
    // list.set(0, "Sue");
    // System.out.println(names[0]);

    List<String> hex = Arrays.asList("30", "8", "3A", "FF");
    Collections.sort(hex);

    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    // System.out.println(d.format(f));

    d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    p = Period.ofDays(1).ofYears(2);
    d = d.minus(p);
    f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    // System.out.println(f.format(d));

    // System.out.println(hex);
  }
}
