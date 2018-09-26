package abstraction;

public class TestAbstractionBank {

				public static void main(String[] args) {
				
				HDFCBank hb = new HDFCBank ();
				hb.credit(); //method present in Bank only
				hb.debit(); // method present in Bank only
				hb.loan(); //method name was present in Bank, but the definition was provided by child HDFC
				hb.funds();
					
				//to achieve dynamic polymorphism, create obj of HDFC without reference but it can be referred by Bank class Interface
				Bank b = new HDFCBank ();
				b.credit(); //inherited method
				b.debit(); // inherited method
				b.loan(); // overridden method
				//b.funds (); will give error as Bank parent cannot inherit the property from child HDFC
			}

		}
	

/* We use abstraction when we want to achieve partial abstraction. When we want to use methods common for all 
 * the classes and some method (loan amount), which should only be defined by a particular class */
