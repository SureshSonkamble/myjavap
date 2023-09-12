package Clonable;
class Students implements Cloneable{  
int rollno;  
String name;  
  
Students(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
	Students s1=new Students(101,"Suresh");  
  
	Students s2=(Students)s1.clone();  
  
	Students s3=new Students(222,"Sumit");   
	
	Students s4=(Students)s3.clone();  
	  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name); 

System.out.println(s3.rollno+" "+s3.name); 
System.out.println(s4.rollno+" "+s4.name); 
  
}catch(CloneNotSupportedException c){}  
  
}  
}  