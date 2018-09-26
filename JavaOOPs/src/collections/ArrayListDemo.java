package collections; //Mukesh Otwani

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList(); //non generic. We have not defined the type of the arraylist.
		
		obj.add(787878);
		obj.add("M");
		obj.add("Selenium WebDriver");
		obj.add(12.34);
		obj.add("Selenium WebDriver"); //ArrayList will allow duplicate values also
		
		
		System.out.println(obj);
		
		//It allows random access to fetch the element, because it stores the values on the basis of indexes
		System.out.println(obj.get(3)); //will get the 4th value in the array (from the index)
		
		//System.out.println(obj.get(4)); will get IndexOutOfBoundsException, as array starts from 0 and there's no 5th element

		System.out.println(obj.size());
		
		// You can add values any time in arraylist
		obj.add(40);
		obj.add(50);
		
		System.out.println(obj.size());
		
		//To print out all the values from the arraylist, use forloop, because it stores the value on the basis of indexes.
		
			for(int i = 0; i<obj.size(); i++) {
				
				System.out.println(obj.get(i));
			}
			
			//Generic value. When you define the type of the arraylist, it will remove the yellow warning sign that data is of raw type
			
			ArrayList<Integer> obj1 =new ArrayList<Integer>();
			obj1.add(10); 
		    //obj1.add("Selenium"); //will not allow you to add String, since the arraylist is Integer type
			
			ArrayList<String> obj2 =new ArrayList<String>();
			obj2.add("Selenium");
	}
}


/*ArrayList is dynamic array. It will allow duplicate values. It maintains insertion order, 0,1,2,3,..
 * It is not synchronized, so it's slow compared to other collections. It allows random access
 * to fetch the element, because it stores the values on the basis of indexes*/
