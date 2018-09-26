package collections; //Mukesh Otwani

public class ArraySingle {

	public static void main(String[] args) {
		
	/*	int a = 100;
		int b = 90;
		int c = 89; */
		
/*	Instead of putting values in each variable, which takes a lot of space in computer memory, we can use array, a collection of similar data type
 * Syntax: datatype arrayname[] = new datatype [size];*/
		
		int student_id [] = new int [5]; //each variable takes 4 byte of  memory, so 5 variables will take 20 byte of memory
		
			student_id [0] = 89;
			student_id [1] = 45;
			student_id [2] = 12;
			student_id [3] = 890;
			student_id [4] = 90;
			
			System.out.println("Students id is " + student_id[2]);
			//System.out.println("Students id is " + student_id[5]); will give ArrayIndexOutofBoundsException, 'cos there're 5 elements only.
			
		//	int sizeofArray = student_id.length;
		//	System.out.println("Length of the array is " + sizeofArray);//will give how  many variables are there, not the values of the variables

		//	for (int i=0; i<sizeofArray; i++) {
		//		System.out.println("Students id is " + student_id[i]);
		//	}
}

}
/*Array starts from index 0. So, if you assign value to the first element, it will be array [0].*/
/* 2 limitations: datatype fixed and size of the array fixed */