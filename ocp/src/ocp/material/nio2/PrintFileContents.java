package ocp.material.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintFileContents {

  public static void main(String[] args) {
    Path path = Paths.get("C:\\Projects\\ISP\\PAES\\batch\\urdw0-common-pojo\\pom.xml");
    try {
      Files.lines(path).forEach(System.out::println);
    } catch (IOException e) {
      // Handle file I/O exception...
    }
  }
}
