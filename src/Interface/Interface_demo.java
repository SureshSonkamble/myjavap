package Interface;

interface intrfc
{
	void print();
    void s();
}

class demo implements intrfc
{
	public void print()
	{
		System.out.println("Interface demo..");
	}
	
	public void s()
	{
		System.out.println("Interface demo..");
	}
	
}

class vs implements intrfc
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void s() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Interface_demo {

	public static void main(String args[])
	{
		demo obj=new demo();
		obj.print();
		obj.s();
		
	}
}
