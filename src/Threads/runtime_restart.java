package Threads;

public class runtime_restart{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("shutdown -r -t 0");  //restart
	  //Runtime.getRuntime().exec("shutdown -s -t 0");   //shutdown
	 }  
}  