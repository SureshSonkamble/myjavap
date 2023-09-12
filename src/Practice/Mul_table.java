package Practice;

import java.util.Scanner;

public class Mul_table {
public static void main(String args[])
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  Number for Multiplication table:");	
	num=sc.nextInt();
	
	
	System.out.println("Multiplication for given number is:");
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+"*"+""+num+"=="+num*i);
	}
}
}
