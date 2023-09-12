package Abtraction;

import java.util.Scanner;

abstract class Human
{
	//public void eat();//  add body or make method to abstract
	
	public abstract void eat();// abstract method must have abstract class
	public void walk()
	{
		System.out.println("Abtrcat class body method ");
	}
}

class Man extends Human
{

	
	public void eat()
	{
		System.out.println("Abtrcat method implemented");
	}
}
public class Abstraction_demo
{

	public static void main(String[] args)
	{
		//Human h=new Human();//can not instantiate the type //if class is abstract
		//Human h1=new Man();
		//h1.eat();
		//h1.walk();
		Man m=new Man();
		m.eat();
		m.walk();
	}

}
