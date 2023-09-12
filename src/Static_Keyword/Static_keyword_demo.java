package Static_Keyword;

public class Static_keyword_demo {
	
	   int rollno;  
	   String name;  
	   String taining_institude ="Technocraft";  
	     
	   Static_keyword_demo(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   
	 void display (){System.out.println(rollno+" "+name+" "+taining_institude);}  
	  
	 public static void main(String args[]){  
		 Static_keyword_demo s1 = new Static_keyword_demo(111,"Suresh");  
		 Static_keyword_demo s2 = new Static_keyword_demo(222,"Sumit");
		 Static_keyword_demo s3 = new Static_keyword_demo(333,"Dipesh");
	   
	 s1.display();  
	 s2.display();  
	 s3.display();
	 }  
}	
