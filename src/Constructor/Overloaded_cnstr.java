package Constructor;

public class Overloaded_cnstr {
	    int id;  
	    String name;  
	    int age;  
	    
	    Overloaded_cnstr(int id){  
		    this.id = id;  
		    }  
	    
	    Overloaded_cnstr(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Overloaded_cnstr(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display1(){System.out.println(id);}  
	    void display2(){System.out.println(id+" "+name);}  
	    void display3(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	Overloaded_cnstr s1 = new Overloaded_cnstr(111);
	    	Overloaded_cnstr s2 = new Overloaded_cnstr(111,"Karan");  
	    	Overloaded_cnstr s3 = new Overloaded_cnstr(222,"Aryan",25);  
	    s1.display1();  
	    s2.display2();  
	    s3.display3();  
	   }  
	}  

