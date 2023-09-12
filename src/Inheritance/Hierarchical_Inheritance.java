package Inheritance;

class Hirecl_one{  
void parent(){System.out.println("Parent Hirecl_one...");}  
}  
class Hirecl_two extends Hirecl_one{  
void child_one(){System.out.println(" Child one Hirecl_two...");}  
}  
class Hirecl_three extends Hirecl_one{  
void child_two(){System.out.println(" Child two Hirecl_three...");}  
}  

public class Hierarchical_Inheritance {
	public static void main(String args[]){  
		Hirecl_three c=new Hirecl_three();  
		c.child_two();  
		c.parent();  
		
		Hirecl_two c1=new Hirecl_two();  
		c1.child_one();
		c1.parent();
		
}
}
