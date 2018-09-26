package keyConcepts;

public class Vehicle {

	public void engine () {
		System.out.println ("Vehicle is the granparent"); //Add extends keyword to Car class now, so that it can inherit the methods from grandparent
		
		/* child class object BMW b can access the engine method from Vehicle class, but Vehicle class object cannot inherit the properties from grandchild*/
	}
}
