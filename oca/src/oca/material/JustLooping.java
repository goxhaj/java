package oca.material;

public class JustLooping {
  private int j;

  void showJ() {
    while (j <= 5) {
      for (int j = 1; j <= 5; ) {
        System.out.print(j + " ");
        j++;
      }
      j++;
      float f = 0x0123;
    }
  }

  public static void main(String[] args) {
    new JustLooping().showJ();

    // System.out.println(null + true); // 1
    // System.out.println(true + null); // 2
    // System.out.println(null + null); // 3
  }
}
