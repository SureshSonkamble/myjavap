package JDBC;

import java.sql.*;  
class UpdatePrepared{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");  
 
PreparedStatement stmt=con.prepareStatement("update testing set name=?,addr=?,email=? where id=?");  
stmt.setString(1,"romesh");//1 specifies the first parameter in the query i.e. name  
stmt.setString(2,"mumbai");
stmt.setString(3,"romesh@gmail.com");//2 specifies the first parameter in the query i.e. addr  
stmt.setInt(4,10);  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records updated");  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  