package Exception;

public class Multicatch{  
	  public static void main(String args[]){  
	   try{  
		   
		  // String str=null;
	       int a[]=new int[5];  
	        a[8]=30/0;  
	   
	   //System.out.println(str.length());
	   }  
	   
	   catch(ArithmeticException e){System.out.println(e);}  
	   catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
	   catch(Exception e){System.out.println(e);}  
	  
	   System.out.println("rest of the code...");  
	 }  
	}  