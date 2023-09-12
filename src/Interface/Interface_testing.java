package Interface;

public class Interface_testing  implements testinng{
	
	public void display()
	{
		System.out.println("Show menthod");
	}
	
	public void show()
	{
		
	}
	     
}

class main_cls
{
	public static void main(String argsp[])
	{
		testinng t=new Interface_testing();
		t.display();
		t.print();
	}
}