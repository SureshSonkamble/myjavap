package Java_logical_program;
class FactorialExample{  
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    //1*2*3*4*5
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}  