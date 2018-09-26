package abstraction;



public class TestInterfaceCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		
		//achieve dynamic polymorphism
		Car c = new BMW ();
		c.start();
		c.stop();
		c.refuel();
		//c.safety (); // only BMW has this method and parent class cannot access this method

	}
}

/* We use Interface when we want to hide the complete business logic*/

