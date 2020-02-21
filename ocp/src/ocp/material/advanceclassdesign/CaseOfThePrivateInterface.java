package ocp.material.advanceclassdesign;

public class CaseOfThePrivateInterface {
  private interface A {}

  private interface Secret {
    public void shh();
  }

  class DontTell implements Secret {
    @Override
    public void shh() {}
  }
}
