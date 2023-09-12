package OOPS;
class test2{
	//int a=10;//data member
	void show_()
	{
		System.out.println("Test2 funtion");
	}
}
class test3{
	int a=10;//data member
	void show()
	{
		System.out.println(a);
	}
	
	void show1()
	{
		System.out.println("second ");
	}
}

public class cls_obj {
	public static void main(String ars[])
	{
		test3 t=new test3();
		t.show();
		t.show1();
		
		//test2 t2=new test2();
		//t2.show_();
		
	}

}
