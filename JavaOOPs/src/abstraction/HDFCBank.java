package abstraction;

public class HDFCBank extends Bank{ /*when you'll extend any abstract class, you must define the abstract method in your class with parenthesis. Or else, it'll give you red error */
	
	public void loan () {
		System.out.println ("HDFC... loan method");
	}
	
	
	public void funds () {
		System.out.println ("HDFC... funds method");
	}

}
