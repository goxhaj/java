package ocp.material.generics;

import java.util.List;

class Bobby {}

class Dobby extends Bobby {}

class Tobby extends Dobby {}

public class TestClassBobbyTobby {
  Bobby b = new Bobby();
  Tobby t = new Tobby();

  public static void main(String[] args) {}

  private void addList1(List<? super Dobby> list) {
    list.add(t);
  }

  private void addList2(List<? extends Dobby> list) {
    b = list.get(0);
  }
}
