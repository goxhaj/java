package oca.test3;

class Game {
  public void play() throws Exception {
    System.out.println("Playing...");
  }
}

class Soccer extends Game {
  public void play(String ball) {
    System.out.println("Playing Soccer with " + ball);
  }
}

public class TestClass {
  public static void main(String[] args) throws Exception {
    Game g = new Soccer();
    // 1
    Soccer s = (Soccer) g;
    // 2
  }

  abstract class A {
    protected int m1() {
      return 0;
    }
  }

  class B extends A {
    @Override
    int m1() {
      return 1;
    }
  }
}
