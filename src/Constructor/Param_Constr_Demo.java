package Constructor;

public class Param_Constr_Demo {
	
	int aa;
	String str;
	Param_Constr_Demo( int a,String str)
	{
		aa=a;
		this.str=str;
		
		System.out.println(a+" "+str);
	}
	
	//void display(){System.out.println(a+" "+str);}  
	
	public static void main(String args[])
	{
		Param_Constr_Demo pcd=new Param_Constr_Demo(1,"Suresh");
		Param_Constr_Demo pcd2=new Param_Constr_Demo(2,"Sumit");
		Param_Constr_Demo pcd3=new Param_Constr_Demo(3,"Dipesh");
		
		//pcd.display();
		//pcd2.display();
		//pcd3.display();
		
	}
}
