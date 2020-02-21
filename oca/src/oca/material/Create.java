package oca.material;

class Create1 {
  Create1() {
    System.out.print("1 ");
  }

  Create1(int num) {
    System.out.print("2 ");
  }

  Create1(Integer num) {
    System.out.print("3 ");
  }

  Create1(Object num) {
    System.out.print("4 ");
  }

  Create1(int... nums) {
    System.out.print("5 ");
  }

  public static void main(String[] args) {
    new Create1(100);
    new Create1(1000L);
  }
}
