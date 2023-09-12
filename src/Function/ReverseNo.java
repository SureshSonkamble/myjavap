package Function;

import java.util.Scanner;

public class ReverseNo 
{

	public static void main(String[] args) 
	{
	int n,rev;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no");
	n=sc.nextInt();
	rev=reverse(n);
	System.out.println("The reverse no is "+rev);
	}

	static int reverse(int n)
	{
		int no,rem,rev=0;
		no=n;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		return rev;
	}
}