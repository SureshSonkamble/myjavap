package Constructor;
class tt
{
	int bb;
	tt(int b)
	{
		bb=b;
		System.out.println("value"+bb);
	}
	void f1()
	{
		System.out.println(" test");
	}
}

public class Constructor_demotest {
	
	public static void main(String args[])
	{
		tt cd=new tt(2);
		cd.f1();
		
		//Constructor_demo cd2=new Constructor_demo();
		// cd3=new Constructor_demo();
		
	}

}
