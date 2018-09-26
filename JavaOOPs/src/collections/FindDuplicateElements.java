package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
		
		//1. Compare each element with the other element. This is the worst approach if there are 100s of elements. Time complexity will be O(nxn)
		
		for (int i = 0; i<names.length; i++) {
			for (int j = i+1; j< names.length; j++) {
				
				if (names[i].equals(names[j])){
					System.out.println ("duplicate element is " + names[i]);
					
				}
			}
		}
				System.out.println ("**********");
		
		
		//2. Using HashSet, part of JavaCollection. It stores unique values, cannot store duplicate values: O(n).
		 
		Set<String> store = new HashSet<String>(); //child class object can be referenced by parent class Interface
		for (String name : names) {
			if (store.add(name)==false) {
				System.out.println ("duplicate element is " + name);
			}
		}
		/*if you have added an element into Set and trying to insert duplicate element again, 
		 * it will not be allowed. If add() returns false it means that element is not allowed in the Set and that is your duplicate.*/
				System.out.println ("**********");	
		
		//3. Using HashMap. Duplicate elements are allowed. Stores in key-value pair. Key will be String and Value will be integer. O(2n)
		
		Map <String, Integer> storeMap = new HashMap<String, Integer>();
		
		for (String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from this HashMap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			if (entry.getValue()>1) {
				System.out.println ("duplicate element is " + entry.getKey());
				
			}
			
		}
		/*check if hash table contains the elements or not, if it is then increment 
		 * the count otherwise insert element with count 1. Once you have this map ready, 
		 * you can iterate over hashmap and print all those keys which has values greater than one. 
		 * These are your duplicate elements. */
	}

}
