package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapNav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		/* when you create the obj of HashMap, it will ask to provide the key and value, therefore, double String*/
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestSelenium");
		hm.put(4, "RFT");
		
		System.out.println(hm); // will print all 4 pairs of keys and values.
		
		System.out.println(hm.get(1)); // will print Selenium only
		
		//Can have null key and not throw exceptions
		System.out.println(hm.get(4)); // there's no key that is 4, so it will print "null"
		
		//To print all the values, use forloop
		
		for (Entry m: hm.entrySet()) {
			System.out.println(m.getKey() +"  " +m.getValue());
		}	
		
		// Can remove any variable/data
		hm.remove(3); // will remove 3=Selenium
		System.out.println(hm); 
		

	}

}

// https://www.youtube.com/watch?v=EFAbTZWbaAg