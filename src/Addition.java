import java.util.Scanner;

public class Addition {
	public static void main(String args[])
	{
		String awnser="";
		
    	do{
		int a,b,sum;	
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");	

	    a=Sc.nextInt();
		
		System.out.println("Enter 2nd Number");	
		b=Sc.nextInt();
		
		sum=a+b;
		System.out.println("Addition is: "+sum);
		
		
		 System.out.println("\n");
	        System.out.println("do you want to continue? Y ? N");
	        awnser=Sc.next();
	        if(awnser.equals("n")||awnser.equals("N"))
	        {
	        	 System.out.println("program Termineted....");
	        }
	        
	    }while(awnser.equals("y")||awnser.equals("Y"));
	}

}
