package collections; //Naveen Automation


	import java.util.HashMap;

	public class HashMapInfo {
		
		public static HashMap<String, String> getUserLoginInfo(){
			
			HashMap<String, String> userMap = new HashMap<String, String>(); /* when you create the obj of HashMap, it will ask to provide the key and value, therefore, double String*/ 
			userMap.put("customer", "naveenk_test@123");//put method accepts key (customer type of user) and value (username and password)
			userMap.put("admin", "adminuser_test@123");
			
			return userMap;
		}	
		//select a date from a dropdown
		public static HashMap<Integer, String> monthMap() {
			HashMap<Integer, String> monthMap = new HashMap<Integer, String>();
			monthMap.put(1, "January");
			monthMap.put(2, "February");
			monthMap.put(3, "March");
			monthMap.put(4, "April");
			monthMap.put(5, "May");
			
			return monthMap;
			
		}
	}


/* Have used static method so that other class can access the methods of HashMapInfo class, no need to create objects of the class*/

//HashMap is a class implementing HashMap Interface
//it extends AbstractMap
//it contains unique elements
//stores the values key-value pair
//maintains no order