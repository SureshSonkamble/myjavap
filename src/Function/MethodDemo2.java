package Function;

import java.util.Scanner;

public class MethodDemo2 {
	
	public static void main(String[] args) {
		//MethodDemo m1=new MethodDemo();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int c=add(a,b);
		System.out.println("The addition is "+c);
	}
	
	static int add(int a,int b)
	{
		int c=a+b;
		//System.out.println("The addition is "+c);
		return c;
	}


}
