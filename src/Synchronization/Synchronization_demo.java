package Synchronization;
class Calculate_Result
{
	synchronized void percentage(int total){  
		System.out.println("Calculating Percentage...");  
		  
		if(total==0){  
		System.out.println("Please Submit the result first...");  
		try{
			wait();
			}catch(Exception e){}  
		}  

		int per=total/3;  
		System.out.println("Your Percentage is:"+per);  
		}  
	synchronized void Total(int amount){  
		System.out.println("Total Submited..");  
		
		notify();  
		}  
		}

public class Synchronization_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate_Result c=new Calculate_Result();  

		 new Thread(){  
		   public void run(){c.percentage(100);}  
		 }.start();  


		new Thread(){  
		   public void run(){c.Total(100);}  
		}.start();  
		  
	}

}
