package Abtraction;
abstract class abs
{
	
	abstract void st();
void ab()
{
	System.out.println("Abstract class");
}
}

class test extends abs
{

	void st() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
	}
	
}
public class abstrct_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.ab();
		t.st();
	}

}
