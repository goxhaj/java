package ocp.material.advanceclassdesign;

interface House1 {
  public default String getAddress() {
    return "101 Main Str";
  }
}

interface Office1 {
  int A = 10;

  public default String getAddress() {
    return "101 Smart Str";
  }
}

class HomeOffice1 implements House1 {

  @Override
  public String getAddress() {
    return "R No 1, Home";
  }
}

public class TestClass13 {

  public static void main(String[] args) {
    House1 off = new HomeOffice1();
    System.out.println(off.getAddress());
  }
}
