package oca.test3;

class TestClass3 {
  static TestClass3 ref;
  String[] arguments;

  public static void main(String args[]) {
    ref = new TestClass3();
    ref.func(args);
  }

  public void func(String[] args) {
    ref.arguments = args;
  }
}
