package Encapulation;

import java.util.Scanner;

class Test{  
	
public static void main(String[] args){  
	
Student s=new Student(); 

Scanner sc =new Scanner(System.in);
String nm=sc.next();
s.setName(nm);  
System.out.println(s.getName());  

s.setId(123);
try{
	System.out.println(s.getId());
}catch(Exception e){}

}  
}  
