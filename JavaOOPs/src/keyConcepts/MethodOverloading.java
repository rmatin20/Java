package keyConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading (); //create the object of the class to access the methods
		
		m.addition();
		m.addition(10); // you've to pass the values of the parameters, or else will give red errors
		m.addition(10, 20);
		
	}
	
		
		public void addition () {
			System.out.println ("Addition method...0 parameter");
			
		//public void subtraction (); you cannot create a method inside a method
	}
		
		public void addition (int i) {
			System.out.println ("Addition method...1 parameter");
			System.out.println (i);
	}
		
		public void addition (int i, int j) {
			System.out.println ("Addition method...2 parameters");
			System.out.println (i+j);
	}

		public static void main(int p) { //main method can be overloaded
		}
		
		public static void main(int p, int q) { //main method can be overloaded
		}
		
}

/* Method Overloading - When method name is same in the same class, but with different arguments/parameters no. or values */

// you cannot create a method inside a method
// you cannot create duplicate methods (same method name and same no. of parameters), will give red errors
//To differentiate between the methods, change the no. of parameters. Very important