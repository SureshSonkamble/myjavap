package Threads;
class Thread_TestMultitasking extends Thread{  
	 public void run(){  
	   System.out.println("task one");  
	 }  
	 public static void main(String args[]){  
		 Thread_TestMultitasking t1=new Thread_TestMultitasking();  
		 Thread_TestMultitasking t2=new Thread_TestMultitasking();  
		 Thread_TestMultitasking t3=new Thread_TestMultitasking();  
	  
	  t1.start();  
	  t2.start();  
	  t3.start();  
	 }  
	}  