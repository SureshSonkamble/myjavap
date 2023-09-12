package Threading_Demo;

class hiii{
	
	public void show()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("Hiii");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class helllo{
	public void show()
	{
		for(int i=1;i<3;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class thread_demo_problem2 {
	public static void main(String args[])
	{
		hiii obj1=new hiii();
		obj1.show();
		helllo obj2=new helllo();
		obj2.show();
	}

}
