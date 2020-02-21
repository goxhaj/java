package oca.test5;

class Super {
  static String ID = "QBANK";
}

class Sub extends Super {
  static {
    System.out.print("In Test");
  }
}

public class Test {
  static void main(String[] args) {
    System.out.println(Sub.ID);
  }
}
