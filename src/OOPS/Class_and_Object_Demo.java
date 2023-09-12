package OOPS;

class Test
{  
	 float a=20.0f;
	 void fun()
	{
		System.out.println(a);
	}
	
	void fun_two()
	{
		System.out.println("Function 2");
	}
	void fun_three()
	{

		System.out.println("Function 3");
	
	}
	

}

class Test_Two
{
	void fun_testing()
	{
		System.out.println("Second Function");
	}
}



public class Class_and_Object_Demo {

	public static void main(String args[])
	{
		Test tst=new Test();
		tst.fun();
		tst.fun_two();
		tst.fun_three();
		
		Test_Two t=new Test_Two();
		t.fun_testing();
	
		
	    			
		
	}
}
