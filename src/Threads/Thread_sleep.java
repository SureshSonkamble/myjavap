package Threads;

class Thread_sleep extends Thread{  
	
	 public void run(){ 
		 
	  for(int i=1;i<=10;i++){  
	    try{
	    	Thread.sleep(2000);
	    	}catch(InterruptedException e)
	            {
	    		System.out.println(e);
	    		}  
	    
	    System.out.println(i);  
	  }  
	 }  
	 

	 public static void main(String args[]){  
		 Thread_sleep t1=new Thread_sleep();  
		 Thread_sleep t2=new Thread_sleep();  
		 Thread_sleep t3=new Thread_sleep();  
	   
	  t1.start();  
	  t2.start();  
	  t3.start();  
	 }  
	}  
