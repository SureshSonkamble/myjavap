import java.util.Scanner;
public class If_Else_Demo {

public static void main(String args[])
{
    int a;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter Number");	
	a=Sc.nextInt();
	
	if(a%2==0)
	{
		System.out.println("Given Number is even");
	}
	else 
	{
		System.out.println("Given Number is odd");
	}
}
}
