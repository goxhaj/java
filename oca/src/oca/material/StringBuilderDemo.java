package oca.material;

public class StringBuilderDemo {

  public static void main(String[] args) {

    StringBuilder str = new StringBuilder("admin");

    System.out.println("string = " + str);

    // prints substring from index 3
    System.out.println("substring is = " + str.substring(3));
    str.append("a");
    System.out.println("substring str: " + str + " indexOf: " + str.indexOf("u"));

    /* prints substring from index 1 to 4 excluding character
    at 4th index */
    System.out.println("substring is = " + str.substring(1, 4));
  }
}
