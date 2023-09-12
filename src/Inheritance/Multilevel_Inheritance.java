package Inheritance;

class Level_one{  
void eat()
{
	System.out.println("Level one...");
}  
}  


class Level_two extends Level_one{  
void bark()
{
	System.out.println("Level two...");
}  
}  


class Level_three extends Level_two{  
	
void weep()
{
	System.out.println("Level three...");
}  
}  


public class Multilevel_Inheritance {
	public static void main(String args[]){  
		Level_three d=new Level_three();  
		d.weep();  
		d.bark();  
		d.eat();  

	}
}
