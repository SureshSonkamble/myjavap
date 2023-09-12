package OOPS;
import java.util.Scanner;
public class Student {
	int roll_no;
	String name;
	float per;
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Your Roll no, Name and Percentage");
	    roll_no=sc.nextInt();
	    name=sc.next();
	    per=sc.nextFloat();
	}

	void display()
	{
		System.out.println("Roll Numebr is :-"+roll_no+"\n"+"Name is:-"+name+"\n"+"Percentages:-"+per);
	}
	
	public static class Data 
	{

		public static void main(String[] args) 
		{
			Student s1;
			s1=new Student();
			s1.input();
			s1.display();
			
		}

	}
}



