package abstraction;

public abstract class Bank {

	public abstract void loan (); // abstract method with abstract keyword. No body, no parenthesis
	
	public void credit () { //non-abstract methodl Child class can directly inherit this method, no need to define in child class
		System.out.println ("Bank... credit");
		
	}
	
	public void debit () { //non-abstract method. Child class can directly inherit this method, no need to define in child class
		System.out.println ("Bank... debit");
	}
}

/*Abstract class can have abstract method and non-abstract methods*/
/* we're hiding the implementation logic of abstract method */
/*if any class extends abstract method, it's their responsibility to define the method their own way */
/* Partial abstraction*/