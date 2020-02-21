package ocp.material.localization;

import java.time.Duration;

public class TestDuration {
  public static void main(String[] args) {
    Duration d = Duration.ofMillis(1100);
    System.out.println(d);
    d = Duration.ofSeconds(61);
    System.out.println(d);
    int count = 0;
    System.out.println(count++);
    System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE + 2);
  }
}
