package ocp.material.designpatterns;

public class Test {

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i++);
    System.out.println(i);
    System.out.println(i++ == (++i - 1));
    System.out.println(i);
  }
}
