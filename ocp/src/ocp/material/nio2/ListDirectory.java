package ocp.material.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListDirectory {

  public static void main(String[] args) {
    try {
      Path path = Paths.get("C:\\Projects");
      Files.list(path)
          .filter(Files::isDirectory)
          .map(p -> p.toAbsolutePath())
          .forEach(System.out::println);
    } catch (IOException e) {
      // Handle file I/O exception...
    }
  }
}
