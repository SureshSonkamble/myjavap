package Final_key;

 final class test{
	
	public void a()
	{
		System.out.print("Final class method");
	}
}


/*class testing extends test{
	//final class can not be extends //prevent inheritance
}*/
public class final_class_demo {

	public static void main(String[] args) {

      test t=new test();
      t.a();
	}

}
