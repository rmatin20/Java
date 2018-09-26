package keyConcepts;

public class MethodOverriding {

	public static void main(String[] args) {
			
			
			BMW b = new BMW (); //create the object of BMW as BMW is publicly defined.
			b.start(); /*child class method will get preference as the method is common to both parent and child class*/
			b.stop();  /*method belongs to only parent class, so parent class method will execute*/
			b.safety(); /*method present only in child class, so child class method will execute*/
			
			
			
			Car c = new Car (); /* you can also create an object of Car class */
			c.start();
			c.stop ();
			c.refuel();
		//	c.safety(); /* Car object (parent) cannot access BMW method (child class method) as it's a security issue. Parent cannot inherit properties from the child but a child can inherit the properties from the parent. There'll be a red mark next to it */
		
		}

	}

// Method Overriding - when a method is common in child class and parent class, child class will execute (same  name and same number of arguments)
// It is also called Static Polymorphism/Compile Time Polymorphism as Java will decide which method to execute during compiling time


