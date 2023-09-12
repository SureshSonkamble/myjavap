package OOPS;

import java.io.IOException;
import java.util.Scanner;

public class hghgh {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String ans="";
		do{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		a=sc.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("ONE");
		       break;
		case 2:System.out.println("TWO");
	       break;
		case 3:System.out.println("THREE");
	       break;
	     default:System.out.println("Invalid Choice"); 
	    
		} System.out.println("Do you want to continue? Y/N");
	     ans=sc.next();
	     if(ans.equals("n"))
	     {
	    	
	    	 System.out.println("System Termminated...");
	    	 
	     }
		}while(ans.equals("y"));
	}

}
