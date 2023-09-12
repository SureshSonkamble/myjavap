package Threads;

class Thread_join extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
		  System.out.println(Thread.currentThread().getName());  
	   try{  
	    Thread.sleep(1000);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i);  
	  }  
	 }  
	 
	public static void main(String args[]){  
		Thread_join t1=new Thread_join();  
		Thread_join t2=new Thread_join();  
		Thread_join t3=new Thread_join();  
	 t1.start();  
	 try{  
	  t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	  
	 t2.start();  
	 t3.start();  
	 }  
	}  