package Constructor;

public class Copy_cnstr {
	  int id;  
	    String name;  
	    Copy_cnstr(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Copy_cnstr(Copy_cnstr s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Copy_cnstr s1 = new Copy_cnstr(111,"Suresh"); 
	    	
	    	Copy_cnstr s2 = new Copy_cnstr(s1);  
	    s1.display();  
	    s2.display();  
	   }  
}
