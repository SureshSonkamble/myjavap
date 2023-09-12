package Interface;

interface Printable{  
void print();  
}  

interface Showable {  
void abc();  
}  

  
public class Interface_mul_inhtnc_demo implements Printable,Showable {

	public void print()
	{
		System.out.println("Hello");
	}  
	public void abc()
	{
		System.out.println("Prints");
	}  

	public static void main(String args[]){  
		Interface_mul_inhtnc_demo obj = new Interface_mul_inhtnc_demo();  
		obj.print();  
		obj.abc();  
		//obj.show();  
}
}