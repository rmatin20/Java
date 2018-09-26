package collections;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {


		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Matt");
		obj.add("Selenium");
		//obj.add(12); will give error as it will accept only datatype String
		
		for(String v: obj) {
			
			System.out.println(v);
		}
	}

}
