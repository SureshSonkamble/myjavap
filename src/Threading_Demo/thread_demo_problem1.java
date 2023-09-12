package Threading_Demo;

class hii{
	
	public void show()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("Hiii");
			
		}
	}
}

class hello{
	public void show()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("Hello");
		}
	}
}
public class thread_demo_problem1 {
	public static void main(String args[])
	{
		hii obj1=new hii();
		obj1.show();
		hello obj2=new hello();
		obj2.show();
	}

}
