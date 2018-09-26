package keyConcepts;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Car c1 = new BMW (); //child class object can be referred by parent class reference variable
		c1.start();  /* child class method will get preference, overridden method*/
		c1.stop();   /* only parent class has this method */
		c1.refuel(); /*  */
		//c1.safety(); cannot access child method as it's a parent class reference
	}

}

// Run-time Polymorphism: the reference variable of parent/super class refers to the object of the child class
//to achieve dynamic polymorphism, create obj of BMW, which can be referred by Car class Interface
// e.g., WebDriver driver = new ChromeDriver();