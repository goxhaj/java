package ocp.material.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Boo {
  int boo = 10;

  public Boo() {
    System.out.println("Boo = " + boo);
  }

  public Boo(int k) {
    System.out.println("In Boo k = " + k);
    boo = k;
  }
}

class BooBoo extends Boo {
  public BooBoo() {
    System.out.println("BooBoo");
  }

  public BooBoo(int k) {
    super(k);
    System.out.println("In BooBoo k = " + k);
  }
}

class Moo extends BooBoo implements Serializable {
  private int moo = 10;
  private static final long serialVersionUID = 2L;
  private transient String name = "Ardi";
  private transient int age = 10;
  private static char type = 'C';

  public Moo() {
    super(5);
    System.out.println("In Moo");
  }

  @Override
  public String toString() {
    return "Moo [moo="
        + moo
        + ", name="
        + name
        + ", age="
        + age
        + ", boo="
        + boo
        + ", type="
        + type
        + "]";
  }
}

public class SerializableTest {

  public static void main(String[] args) throws Exception {

    Moo moo = new Moo();
    FileOutputStream fos = new FileOutputStream("c:\\temp\\moo1.ser");
    ObjectOutputStream os = new ObjectOutputStream(fos);
    System.out.println("Serialize: " + moo);
    os.writeObject(moo);
    os.close();
    FileInputStream fis = new FileInputStream("c:\\temp\\moo1.ser");
    ObjectInputStream is = new ObjectInputStream(fis);
    moo = (Moo) is.readObject();
    System.out.println("Deserialize: " + moo);
    is.close();
  }
}
