package Exception;
class Multitry{  
	 public static void main(String args[]){  
	  try{  
		  
	    try{  
	     System.out.println("going to divide");  
	     int b =39/0;  
	    }catch(ArithmeticException e){System.out.println(e);}  
	   
	    try{  
	    int a[]=new int[5];  
	    a[4]=4;  
	    }catch(Exception e){System.out.println(e);}  
	     
	    String str="Suresh";
		  System.out.println(str.length());
	    System.out.println("other statement");  
	  }catch(Exception e){System.out.println(e);}  
	  
	  System.out.println("normal flow..");  
	 }  
	}  