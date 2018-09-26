package abstraction;

	public class BMW implements Car {

		@Override
		public void start () {
			System.out.println("BMW...start");
		}
		
		@Override
		public void stop () {
			System.out.println("BMW...safety");
		}
		
		@Override
		public void refuel () {
			System.out.println("BMW...refuel");
		}
		
		public void safety() { // BMW class can have non overridden methods also 
			
		}
	}

	/* We use Interface when we want to hide the complete business logic*/
