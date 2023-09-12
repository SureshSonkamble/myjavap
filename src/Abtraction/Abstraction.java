package Abtraction;

import java.util.Scanner;

abstract class Shape
{
	abstract void area();
	void draw()
	{
		System.out.println("Abract class function...");
	}
	
}

class Circle extends Shape
{
	void area()
	{
		int r;
		float aoc;
		System.out.println("Enter the radius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		aoc=3.14f*r*r;
		System.out.println("The area of circle is "+aoc);
	}
}
public class Abstraction
{

	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.draw();
		c1.area();	
		
	}

}
