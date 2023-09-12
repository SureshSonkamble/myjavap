package OOPS;


class one{
	void show_one()
	{System.out.println("class one object Testing");}
	
}

class two{
	void show_two()
	{System.out.println("class two object Testing");}
}

class three{
	void show_three()
	{
		System.out.println("class three object Testing");}
    }

 class Many_class {
public static void main(String args[])
{
	System.out.println("Multi object Testing");
	
	one on=new one();
	on.show_one();
	
	
	
	two t=new two();
    t.show_two();	
   
    
    three th=new three();
    th.show_three();
	
}
}
