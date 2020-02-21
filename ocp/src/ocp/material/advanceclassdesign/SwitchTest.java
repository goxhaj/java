package ocp.material.advanceclassdesign;

enum Switch {
  ON,
  OFF
}

public class SwitchTest {

  public static void main(String[] args) {
    Switch s = Switch.ON;
    switch (s) {
      case OFF:
        System.out.println("It is off!");
        break;
    }
  }
}
