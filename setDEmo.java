package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class setDEmo {
	public static void main(String[] args) {

    HashSet<String> set = new HashSet<String>();
    set.add("B");
    set.add("B");
    set.add("C");
    set.add("A");
    set.add("E");
    set.add("F");
    
    set.remove("B");
    
    Iterator<String> iterator = set.iterator();
   while(iterator.hasNext()) {
	   System.out.println(iterator.next());
   }
    //set.clear();
    System.out.println(set);
	
	}
}
