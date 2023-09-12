package Threads;

class Thread_Getname_Setname extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	  
	 
	 public static void main(String args[]){  
		 Thread_Getname_Setname t1=new Thread_Getname_Setname();  
		 Thread_Getname_Setname t2=new Thread_Getname_Setname();  
		 Thread_Getname_Setname t3=new Thread_Getname_Setname();  
		 
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	  System.out.println("Name of t2:"+t3.getName());  
	  System.out.println("id of t1:"+t1.getId());  
	  
	  t1.start();  
	  t2.start();  
	  t3.start();  
	  
	  t1.setName("Suresh");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  