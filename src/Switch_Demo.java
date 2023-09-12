import java.util.Scanner;

public class Switch_Demo {
	
	public static void main(String args[])
	{
		int a;	
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number");	
		a=Sc.nextInt();
		
		
		// String str = Sc.next();
      //  char grade = str.charAt(0);
	
	switch(a)
	{
	case 1:
		System.out.println("one");
		break;
		
	case 2:
		System.out.println("two");
		break;
		
	case 3:
		System.out.println("three");
		break;
		
	 default:
		System.out.println("Default");
		break;
		
	}
	}
}
