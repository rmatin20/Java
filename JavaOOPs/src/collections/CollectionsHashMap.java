package collections; //Mukesh, https://www.youtube.com/watch?v=rOADM99d_fY

import java.util.HashMap;

public class CollectionsHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> obj = new HashMap<String, String>(); /* when you create the obj of HashMap, it will ask to provide the key and value, therefore, double String*/ 
		obj.put("400", "Matt");//put method (like adding) accepts key and value
		obj.put("601", "Sahi");
		obj.put("602", "Katalon");
		obj.put("500", "Selenium");
		obj.put("600", "QTP");
		obj.put("700", "Appium");
		obj.put("700", "Appium");
		
		System.out.println(obj);
		
		String value = obj.get("700"); //give the key to get the value
		System.out.println("Value from Map is " + value); //will NOT allow duplicate entry
		
	}
}

