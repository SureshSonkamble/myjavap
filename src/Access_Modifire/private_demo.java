package Access_Modifire;

class A{  
	int data=22;
	//private int data=40;  
	//protected int data=40;  
	public void msg(){System.out.println("Hello java");}  
}  
  

public class private_demo{  
 public static void main(String args[]){  
	 
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  