package Array;

public class ArrayExample {
	public static void main(String[] args) {
		//Java Program to illustrate the use of declaration, instantiation   
		//and initialization of Java array in a single line  
		int salaries[] = {50000, 75340, 110500, 98270, 39400};//declaration, instantiation and initialization 
		for(int i=0; i<salaries.length; i++) {
			System.out.println("The element at index " + i + " has the value of " + salaries[i]);
		}
	}
}