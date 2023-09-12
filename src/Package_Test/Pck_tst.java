package Package_Test;
import Package.*;

public class Pck_tst {

	public static void main(String args[])
{

		Pck_Test tst=new Pck_Test();
		tst.msg2();
		//tst.msg();//private method can not access outside of the package
		//tst.msg3();//protected method can not access outside of the package
		
}
}
