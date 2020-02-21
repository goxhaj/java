package oca.material;

class Order {
  static String result = "";

  {
    result += "c";
  }

  static {
    result += "u";
  }

  {
    result += "r";
  }
}

public class OrderDriver {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("xxxx").insert(0, "ddd-ddd-dddd", 0, 8);

    sb.ensureCapacity(2);
    System.out.println(sb);
    System.out.print(Order.result + " ");
    System.out.print(Order.result + " ");
    new Order();
    new Order();
    System.out.print(Order.result + " ");
  }
}
