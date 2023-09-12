package Threads;
class Thread_runables implements  Runnable {
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("Runable thead");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Thread_runable {
	
	public static void main(String args[]){  
		Thread_runables m1=new Thread_runables();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		
		
}
}