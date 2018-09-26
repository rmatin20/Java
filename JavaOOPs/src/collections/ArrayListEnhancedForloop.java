package collections;

import java.util.ArrayList;

public class ArrayListEnhancedForloop {

	public static void main(String[] args) {
		
	ArrayList obj = new ArrayList();
		
		obj.add(787878);
		obj.add("M");
		obj.add("Selenium WebDriver");
		obj.add(12.34);
		obj.add("Selenium WebDriver"); //ArrayList will allow duplicate values also
		
		for (Object abc: obj) {
			
			System.out.println("Values are " + abc);
		}

	}

}
