package collections;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map;

public class HashMapNavinReddy {

	static HashMap <String, String> phonebook = new HashMap <> ();
	
	public static void main(String[] args) {
			
		phonebook.put("Vector", "987456321"); // get Vector, it will return his phone number
		phonebook.put("Navin", "987456321");
		phonebook.put("Navina", "987456320");
		phonebook.put("Navinan", "987456322");
		phonebook.put("Navinann", "987456323");
	
		//to get the values
		System.out.println (phonebook.get("Navin"));
		
		//for (String s: phonebook.keySet()) { // will print the all the keys only
		//	System.out.println (s); //this code is correct, had to comment to print the Entrys (key value pair) below
			
			for (Map.Entry kv : phonebook.entrySet()) {
				System.out.println (kv);
			//}
			
		}
	}
}
// How to use HashMaps in Java, Vector Gaming, 2013. https://www.youtube.com/watch?v=j442WG8YzM4