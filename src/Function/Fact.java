package Function;

import java.util.Scanner;

public class Fact 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		int fac=fact(n);
		System.out.println("The factorial of "+n+" is "+fac);
	}
	
	static int fact(int n)
	{
		int fac=1;
		while(n>0)
		{
		 fac=fac*n;
		 n--;
		}
		return fac;
	}
}