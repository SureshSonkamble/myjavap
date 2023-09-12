package Static_Keyword;

public class Static_Method {

	 int rollno;  
     String name;  
     static String college = "TTS";  
       
     static void chng(){  
     college = "KTHM";  
     }  
  
     Static_Method(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    	
    	Static_Method.chng();
    	Static_Method s1 = new Static_Method (111,"Karan"); 
    	Static_Method s2 = new Static_Method (222,"Aryan");  
    	Static_Method s3 = new Static_Method (333,"Sonoo");  
  
    	   s1.display(); 
    	   s2.display();  
    	   s3.display();  
}

}