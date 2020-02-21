package ocp.material.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {

  public static void main(String[] args) {
    final Path path = Paths.get(".").normalize(); // h1

    System.out.println(path.toString());
    int count = 0;
    for (int i = 0; i < path.getNameCount(); ++i) {
      count++;
    }
    System.out.println(count);
  }
}
