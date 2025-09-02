package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {
 
	public static void main(String[] args) {
		
		 Map<String,String> map = new HashMap<String,String>();
		 map.put("Vikram", "officer1");
		 map.put("Shivam", "officer2");
		 map.put("bala", "officer3");
		 map.put("kaushal", "officer4");
		 
//		 map.forEach((k,v)->{
//			 System.out.println(k+" , "+v);
//		 });
//		 
		 for(Entry<String, String> entry :map.entrySet()) {
			 System.out.println(" key = "+entry.getKey()+" and value = "+entry.getValue());
		 }
		 
	}
}
