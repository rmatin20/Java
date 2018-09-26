package abstraction;

public interface Car {
	
	//only final and static variables
	int wheels = 4;

	public void start(); 	//abstract method
	public void stop(); 	//abstract method
	public void refuel();	//abstract method
}



/* in Interface, you've to achieve 100% abstraction, no method body
 * we cannot create objects of abstract class or Interface*/
 