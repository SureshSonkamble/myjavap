package Function;

import java.util.Scanner;

public class AreaCircle 
{

	public static void main(String[] args)
	{
		int r;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextInt();
		float a=area(r);
		System.out.println("The area of circle having radius "+r+" is "+a);
		
	}
	static float area(int r)
	{
		float a;
		a=3.14f*r*r;
		return a;
	}

}
