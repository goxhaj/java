package ocp.material.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WalkDirectory {

  public static void main(String[] args) {
    try {
      Files.walk(Paths.get("C:\\Users\\agoxhaj\\eclipse-workspace\\ocp\\src\\ocp\\material"), 2)
          .filter(p -> p.toString().endsWith(".java"))
          .forEach(System.out::println);
    } catch (IOException e) {
      // Handle file I/O exception...
    }
  }
}
