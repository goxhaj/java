package oca.test3;

class B {

  public static void main(String[] args) {

    boolean hasParams = (args == null ? false : true);
    if (hasParams) {
      System.out.println("has params");
    }
    {
      System.out.println("no params");
    }
  }

  // public static void sM1() {  System.out.println("In sub static"); }

  // public  void sM1() {  System.out.println("In sub non-static"); }

}
