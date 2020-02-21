package ocp.material.advanceclassdesign;

public class Onion {
  private String data = "skin";

  private class Layer extends Onion {
    String data = "thegoodpart";

    public String getData() {
      return data;
    }
  }

  public static void main(String[] args) {
    Onion.Layer o = new Onion().new Layer();
    System.out.println(o.getData());
  }
}
