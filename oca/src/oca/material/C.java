package oca.material;

interface I {}

class A implements I {}

class B extends A {}

class C extends B {

  public static void main(String args[]) {
    A a = new A();
    B b = new B();
    a = (B) b;
  }
}
