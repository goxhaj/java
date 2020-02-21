package oca.test4;


class A{
   public static void main(String args[]){
      A a = new A();
      B b = new B();
      a = b;  // 1
      b = a;  // 2
      a = b; // 3
      b = (B) a; // 4
      Object o = {};
      Object o1 = new Object[1]{ new Object() };
   }
}
class B extends A { }
