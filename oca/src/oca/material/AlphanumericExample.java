package oca.material;

class AlphanumericExample {
  public static void main(String... s) {
    String s1 = "abcdefghijklmnopqrstuvwxyz**";
    // String s1 = "a123safdsdtertb566y453";s2 = "jh@l";
    System.out.println(s1.matches("[ $%&'()*+,-./:;<=>?_\\\"a-zA-Z0-9]+"));
    // System.out.println(s2.matches("[a-zA-Z0-9]+"));
  }
}
