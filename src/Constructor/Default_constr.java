package Constructor;

public class Default_constr {
	int id;  
	float f;
	String name;  
	  
	void display()
	{
		System.out.println(id+" "+name+" "+f);
	}  
	  
	public static void main(String args[]){  
		Default_constr s1=new Default_constr();  
	    s1.display();  
}
}
