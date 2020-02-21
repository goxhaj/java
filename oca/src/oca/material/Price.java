package oca.material;

import java.util.ArrayList;
import java.util.List;

public class Price {
  public void admission() {

    int amount = 0b101;
    // int amount = 0xE;
    // double amount = 0xE;
    System.out.println(amount);
  }

  public static void main(String[] args) {
    Price price = new Price();
    price.admission();

    List<String> addr = new ArrayList<>();
    addr.add("A");
    addr.add("B");
    System.out.println(addr);
  }
}
