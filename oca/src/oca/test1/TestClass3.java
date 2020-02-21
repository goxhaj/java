package oca.test1;




interface T1{
}
interface T2{
   int VALUE = 10;
   void m1();
}

interface T3 extends T1, T2{
   @Override
public void m1();
   public void m1(int x);
}
class Base{
   public short getValue(){ return 1; } //1
}
class Base2 extends Base{
   @Override
public byte getValue(){ return 2; } //2
}
public class TestClass3{
   public static void main(String[] args){
	   String[] sA = { "aaa"};
	   String[] sA1 = new String[1] { "aaa"};
      Base b = new Base2();
      System.out.println(b.getValue()); //3
      
      
   }
}
