package JDBC;

import java.sql.*;
import java.util.Scanner;  
class InsertPrepared_Test{  
public static void main(String args[]){  
	String nm,adr,eml;
try{  
	
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Entre name, address, email");
	nm=sc.next();
	adr=sc.next();
	eml=sc.next();*/
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");  
//PreparedStatement stmt=con.prepareStatement("insert into testing values(?,?,?,?)");  
PreparedStatement stmt=con.prepareStatement("insert into testing(name,addr,email) values(?,?,?)"); 
//stmt.setInt(1,4);//1 specifies the first parameter in the query  
stmt.setString(1,"Krishana");  
stmt.setString(2,"US");  
stmt.setString(3,"krishana@gmail.com");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  