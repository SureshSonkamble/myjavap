package JDBC;

import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db_test","root",""); 
	
//here tts is database name, root is username and password  
Statement stmt=con.createStatement();  
//ResultSet rs=stmt.executeQuery("select * from testing WHERE NAME LIKE '%SH' ");  
ResultSet rs=stmt.executeQuery("select * from test"); 
while(rs.next())  
	
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+" Row No. "+rs.getRow());  

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  