package oca.test1.copy;

public class TestClass {

  public static void main(String[] args) throws Exception {
    String myStr = "good";
    char[] myCharArr = {'g', 'o', 'o', 'd'};

    String newStr = "";
    for (char ch : myCharArr) {
      newStr = newStr + ch;
    }

    System.out.println(
        (newStr == myStr) + " " + (newStr.equals(myStr)) + " " + newStr + " " + myStr);

    int i;
    int j;
    for (i = 0, j = 0; j < i; ++j, i++) {
      System.out.println(i + " " + j);
    }
    System.out.println(i + " " + j);

    String hello = "Hello", lo = "lo";

    System.out.println(hello == ("Hel" + lo).intern()); // line 5
  }
}
