import java.util.Scanner;

public class Add {
	public static void main(String args[])
	{
		int a,b,add;
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number");	
	     a=Sc.nextInt();
	     
	     System.out.println("Enter 2nd Number");	
	     b=Sc.nextInt();
	    
	     
	     add=a+b;
	     
	     System.out.print("Addition of number "+add);
	}

}
