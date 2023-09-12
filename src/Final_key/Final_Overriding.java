package Final_key;

class parent{
	
	void p()
	{
		System.out.print("Property...");
	}
	
 final void m()
	{
		System.out.print("Marry...Laxmi");
	}
}

class child extends parent{
	
	/*void m()
	{
		System.out.print("Marry...Ashu.");
	}*/
	
}


public class Final_Overriding {
	
	public static void main(String args[])
	{
	 child c=new child();
	 {
		// c.p();
		 c.m();
	 }
	
	}
}
