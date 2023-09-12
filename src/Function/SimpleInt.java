package Function;

import java.util.Scanner;
public class SimpleInt
{

	public static void main(String[] args) 
	{
		int p,n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of p, n, r");
		p=sc.nextInt();
		n=sc.nextInt();
		r=sc.nextInt();
		float si=simi(p,n,r);
		System.out.println("The simple interest is "+si);		
	}
	static float simi(int p, int n, int r)
	{
		float si=(p*n*r)/100;
		return si;
	}

}
