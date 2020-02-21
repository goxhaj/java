package ocp.material.advanceclassdesign;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A {
  private int x = 10;

  class B {
    private static final int x = 20;

    class C {

      private int x = 30;

      public void allTheX() {
        System.out.println(x); // 30
        System.out.println(this.x); // 30
        System.out.println(B.x); // 20
        System.out.println(A.this.x); // 10
      }
    }
  }

  public static void main(String[] args) throws IOException {
    A a = new A();
    A.B b = a.new B();
    A.B.C c = b.new C();
    c.allTheX();

    FileWriter fw = new FileWriter("c:\\temp\\test.txt");
    BufferedWriter bfw = new BufferedWriter(fw);
    // bfw.writeUTF("hello"); // 1
    // bfw.newLine(); // 2
    // bfw.write("world"); // 3
  }
}
