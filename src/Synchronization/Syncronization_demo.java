package Synchronization;

//example of java synchronized method
class Table
{
	synchronized void printTable(int n)
  {
  	for(int i=1;i<=10;i++)
  	{
  		System.out.println(n*i);
  		
  			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
  	}
  }
}

class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}

class MyThread3 extends Thread
{
	Table t;
	MyThread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(20);
	}
}

public class Syncronization_demo 
{
	public static void main(String args[])
	{
			Table obj = new Table();
			MyThread1 t1=new MyThread1(obj);
			MyThread2 t2=new MyThread2(obj);
			MyThread3 t3=new MyThread3(obj);
			
			t1.start();
			
			t2.start();
			t3.start();
		
		
		
	}
}
