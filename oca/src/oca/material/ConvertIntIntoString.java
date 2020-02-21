package oca.material;

public class ConvertIntIntoString {
  int ids[], types;

  public static void main(String[] args) {
    System.out.println(convertIntToStringWith0PrefixFormatNumber(10, 123L));
  }

  private static String convertIntToStringWith0PrefixFormatNumber(int length, Long num) {
    StringBuffer str = new StringBuffer("");
    Long.toString(num);
    return (num < length ? "0" : "") + num;

    // StringUtils.leftPad("129018", 10, "0");
  }
}
