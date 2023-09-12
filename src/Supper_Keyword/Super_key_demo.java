package Supper_Keyword;

class parent
{
	String clr="White";
	
/*	void p_fun()
	{
		System.out.println("Parent Function test");
	}*/
}

class child extends parent
{
	String clr="Black";
	
	void show()
	{
		System.out.println(super.clr);
		//System.out.println(clr);
	}
	
	/*void p_fun()
	{
		System.out.println("Child Function test");
	}
	
	void function_test()
	{
		
		//super.p_fun();
		p_fun();
	}*/
	
}
public class Super_key_demo {
	
	public static void main(String args[])
	{
		child c=new child();
		c.show();
		//c.function_test();
		
	}

}
