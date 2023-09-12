package Package_Test;
import Package.*;
class tst extends Pck_Test
{
	void show()
	{
	   msg3();
	  
	}
}

public class Pck_tst2 {

	public static void main(String args[])
{
		tst t=new tst();
		//t.msg();
		t.show();
		Pck_Test tst=new Pck_Test();
		tst.msg2();
		//t.show();//private method can not access outside of the package
		//t.msg2();
		
}
}
