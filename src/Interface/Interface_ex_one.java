package Interface;

interface Drawable{  
void draw();  
}  


//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  

class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
} 

public class Interface_ex_one {
	public static void main(String args[]){  
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();  
		
		Drawable d1=new Rectangle();//In real scenario, object is provided by method e.g. getDrawable()  
		d1.draw();  
}
}