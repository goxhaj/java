package ocp.material.generics;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TestClass {
  public static void main(String[] args) {
    NavigableMap<String, String> mymap = new TreeMap<String, String>();
    mymap.put("a", "apple");
    mymap.put("b", "boy");
    mymap.put("c", "cat");
    mymap.put("aa", "apple1");
    mymap.put("bb", "boy1");
    mymap.put("cc", "cat1");

    System.out.println(mymap);

    mymap.pollLastEntry(); // LINE 1         cc 

    System.out.println(mymap);

    mymap.pollFirstEntry(); // LINE 2 a

    System.out.println(mymap);

    NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); // LINE 3      

    System.out.println(tailmap);

    System.out.println(tailmap.pollFirstEntry()); // LINE 4        

    System.out.println(mymap);

    System.out.println(mymap.size()); // LINE 5              
    System.out.println(mymap);
  }
}
