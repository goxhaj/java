package oca.material;

import java.math.BigDecimal;
import java.util.HashMap;

public class ConcatenateMaps {

  public static void main(String[] args) {
    HashMap<String, BigDecimal> m = new HashMap<>();
    HashMap<String, BigDecimal> m2 = new HashMap<>();

    m.put("apple", BigDecimal.valueOf(2));
    m.put("pear", BigDecimal.valueOf(3));
    m2.put("apple", BigDecimal.valueOf(9));
    m2.put("banana", BigDecimal.valueOf(6));

    m2.forEach((k, v) -> m.merge(k, v, (v1, v2) -> v1.add(v2)));

    System.out.println(m);
  }
}
