package oca.test4;

class A1 {
  public void doA(int k) throws Exception { // 0
    for (int i = 0; i < 10; i++) {
      if (i == k) throw new Exception("Index of k is " + i); // 1
    }
  }

  public void doB(boolean f) { // 2
    if (f) {
      //
    } else return;
  }

  public static void main(String[] args) { // 4
    A1 a = new A1();
    a.doB(args.length > 0); // 5
  }
}
