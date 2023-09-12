package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Myserial {
	  
    public static void main(String args[]) throws IOException
    {
    	//String str="aaa";
    	Student s1 =new Student(1,"Namshik","Adv. Java");  
    	Student s2 =new Student(2,"Technokraft","java");  
    	      
     ObjectOutputStream out=new ObjectOutputStream (new FileOutputStream("D:\\serial_demmo.txt"));  
     
     out.writeObject(s1); 
     out.writeObject(s2); 
        
     out.flush();  
    
     System.out.println("success");
     
    }  
 }  
 