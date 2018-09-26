package collections; //Mukesh Otwani

public class Array2D {

	public static void main(String[] args) {
		
		int school [][] = new int [2][2]; //[row] [column]
		
		school [0][0] = 12;
		school [0][1] = 24;
		school [1][0] = 36;
		school [1][1] = 12;
		
		
		System.out.println("Students id is " + school[1][1]);
		
		int sizeofArray = school.length;
		System.out.println("Length of the array is " + sizeofArray);
				
		}
}



/*in Selenium, we only use single array and 2D array.*/