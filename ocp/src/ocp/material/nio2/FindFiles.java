package ocp.material.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindFiles {
  public static void main(String[] args) {
    Path path = Paths.get("C:\\Projects\\ISP\\PAES");
    long dateFilter = 1420070400000l;
    try {
      Stream<Path> stream =
          Files.find(
              path,
              0,
              (p, a) ->
                  p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter);
      stream.forEach(System.out::println);
    } catch (Exception e) {
      //
    }
  }
}
