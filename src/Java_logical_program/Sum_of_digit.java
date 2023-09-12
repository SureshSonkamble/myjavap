package Java_logical_program;

import java.util.*;

public class Sum_of_digit {
	
	static int digSum(int n)
	{
		int sum = 0;
		// Loop to do sum while
		// sum is not less than
		// or equal to 9
		while (n > 0 || sum > 9) 
		{
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	// Driver code
	public static void main(String argc[])
	{
		int a;	
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Vehicle Number");	
		a=Sc.nextInt();
		
		System.out.println(digSum(a));
		if(digSum(a)==9)
				{
			System.out.println("Vehicle Number is VIP");	
				}
		else
		{
			System.out.println("Vehicle Number is not VIP");	
				}
	}
}


