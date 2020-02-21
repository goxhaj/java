package ocp.material.advanceclassdesign;

enum Pets {
  DOG("D"),
  CAT("C"),
  FISH("F") {
    @Override
    public String info() {
      return prefix + "fish";
    }
  };
  static String prefix = "I am a ";
  String name;

  public String info() {
    return prefix + "" + name;
  };

  Pets(String s) {
    name = s;
  }

  public String getData() {
    return name;
  }
}

interface Account {
  public default String getId() {
    return "0000";
  }
}

interface PremiumAccount extends Account {
  @Override
  public String getId();
}

public class BankAccount implements PremiumAccount {
  public static void main(String[] args) {
    Account acct = new BankAccount();
    System.out.println(acct.getId());
    System.out.println(Pets.CAT.info());
  }

  @Override
  public String getId() { // TODO Auto-generated method stub
    return "1";
  }
}
