package OOPS;
import java.util.Scanner;

class studs{
	
	int s1,s2,s3,ttl,per;
	int roll_no;
	//String name;
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter marks of three subject");
	    s1=sc.nextInt();
	    s2=sc.nextInt();
	    s3=sc.nextInt();
	}

	void total(){
		
		 ttl=s1+s2+s3;
	}
	
	void percentage()
	{
		per=ttl/3;
		
	}
	void display()
	{
		System.out.println("Subject one marks :-"+s1+"\n"+"Subject two marks:-"+s2+"\n"+"Subject three marks:-"+s3+"\n"+"Total:-"+ttl+"\n"+"Percentages:-"+per);
	}
	
}

public class Student_test {
	public static void main(String args[])
	{
		studs s=new studs();
		s.input();
		s.total();
		s.percentage();
		s.display();
	}
}
