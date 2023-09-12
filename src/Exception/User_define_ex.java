package Exception;

import java.util.Scanner;

public class User_define_ex {
	static void validate(int age){  
		try
		{
	     if(age<18)
	     
	      throw new ArithmeticException("not valid age");  
	     else  
		      System.out.println("welcome to vote"); 
		}catch(Exception e)
		{
			System.out.println("not valid age");
		}
	      
	}
		   public static void main(String args[]){  
                int a;
				Scanner Sc=new Scanner(System.in);
				System.out.println("Enter Age");	
				a=Sc.nextInt();
				
		      validate(a);  
		    //  System.out.println("rest of the code...");  
		  }  
}
