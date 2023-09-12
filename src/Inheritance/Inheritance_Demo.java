package Inheritance;

class parent 
{
	int a=222;
	
	void p_show()
	{
		System.out.println("Parent class value: "+a);
	}
}

class child extends parent
{
	int b=111;
	
	void c_show()
	{
		System.out.println("child class value: "+b);
	}
	
}
public class Inheritance_Demo {

	public static void main(String args[])
	{
		child c=new child();
		c.c_show();
		c.p_show();
				
	}
}
