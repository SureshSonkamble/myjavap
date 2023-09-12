package Pollymorphism;

import java.util.Scanner;

class Adder{  
	
 static int add(int a,int b)
{
	return a+b;	
}  

static float add(int a,float c)
{
	return a+c;
} 

static float add(int a,float c ,int d)
{
	return a+c+d;
	
} 

} 
public class pollymorphism_demo { 
	public static void main(String[] args){  
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
System.out.println(Adder.add(n1,n2));  
System.out.println(Adder.add(11,11)); 
System.out.println(Adder.add(11,11,11)); 

}
}