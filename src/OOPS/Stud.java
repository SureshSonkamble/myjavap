package OOPS;

import java.util.Scanner;

 class srud_test {
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
		//System.out.println("Roll Numebr is :-"+roll_no);
		System.out.println("Roll Numebr is :-"+roll_no+"\n"+"Name is:-"+name+"\n"+"Percentages:-"+per);
	}

}

public class Stud {
	public static void main(String args[])
	{
		srud_test t=new srud_test();
		t.input();
		t.display();
	}

}
