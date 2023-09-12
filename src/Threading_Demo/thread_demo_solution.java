package Threading_Demo;

import java.io.IOException;

class thrd1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hiii");
			
          
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class thrd2 extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class thrd3 extends Thread {
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("Test...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


/*class notepad extends Thread {
	public void run()
	{
		try {
			Runtime.getRuntime().exec("notepad");
			Thread.sleep(10000);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	}

}*/
public class thread_demo_solution {
	public static void main(String args[])
	{
		thrd1 obj1=new thrd1();
		thrd2 obj2=new thrd2();
		thrd3 obj3=new thrd3();
		//notepad n=new notepad();
		obj1.start();
		
		try
		{
			obj1.join();//5
			
			
		}catch(Exception e)
		{}
	    //n.start(); 
		obj2.start();
	    obj3.start();
		
	}

}
