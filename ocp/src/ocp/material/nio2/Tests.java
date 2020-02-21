package ocp.material.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Tests {
  public static void main(String[] args) throws IOException {
    // Path path = Paths.get("/animals");
    // boolean myBoolean =
    // Files.walk(path)
    // .filter((a) -> a.is) // w1
    // .findFirst()
    // .isPresent(); // w2
    // System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");

    /*Files.walk(Paths.get("..").toRealPath().getParent()) // u1
    .map(p -> p.toAbsolutePath().toString()) // u2
    .filter(s -> s.endsWith(".java")) // u3
    .collect(Collectors.toList())
    .forEach(System.out::println);*/

    Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
    Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
    System.out.print(Files.isSameFile(path1, path2));
    System.out.print(" " + path1.equals(path2));
    System.out.print(" " + path1.normalize().equals(path2.normalize()));

    Path path = Paths.get("sloth.schedule");
    BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

    if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
      // attributes.setTimes(null, null, null);

    }
  }
}
