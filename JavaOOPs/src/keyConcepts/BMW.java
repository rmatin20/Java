package keyConcepts;

public class BMW extends Car{ //to show relation between 2 classes, use extends keyword

	public void start () {
		System.out.println("BMW...start");
	}
	
	public void safety () {
		System.out.println("BMW...safety");
	}
	
}

//BMW has access to all the 3 methods of Car class and also its own 2 methods.