package Threads;

public class Thread_demo extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running...");
	}
	
	public static void main(String args[])
	{
		Thread_demo td=new Thread_demo();
		td.start();
		
		Thread_demo td1=new Thread_demo();
	    td1.run();
		

		Thread_demo td2=new Thread_demo();
	    td2.start();
		
	}

}
