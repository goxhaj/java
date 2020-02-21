package ocp.material.generics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class GenericsAdvanced {

  public static void main(String[] args) {

    Map<Object, Object> m = new LinkedHashMap<Object, Object>();

    m.put("1", new ArrayList()); // 1
    m.put(1, new Object()); // 2
    m.put(1.0, "Hello"); // 3
    System.out.println(m);
  }
}
