package oca.test2;

public class TestClass1 {

  public TestClass1(long pLong) {
    l1 = pLong;
  };

  long l1;

  public void TestClass1(long pLong) {
    l1 = pLong;
  } // (1)

  public static void main(String args[]) {
    TestClass1 a, b;
    // a = new TestClass1();  //(2)
    b = new TestClass1(5);
    ;;;;;;; // (3)
  }
}
