package Pollymorphism;

 class parent{
	
	void p()
	{
		System.out.print("Property...");
	}
	
 	void m()
	{
		System.out.print("Marry...Laxmi");
	}
}

class child extends parent{
	
	void m()
	{
		System.out.print("Marry...Ashu.");
	}
	
}

class child2 extends parent{
	
		
}

public class Overriding_Demo {
	
	public static void main(String args[])
	{
	 child c=new child();
	 {
		// c.p();
		 c.m();
	 }
	
	}
}
