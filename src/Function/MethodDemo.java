package Function;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		//MethodDemo m1=new MethodDemo();
		hello();
		add();

	}
	
	static void hello()
	{
		System.out.println("Hello");
	}
	static void add()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("The addition is "+c);
	}

}
