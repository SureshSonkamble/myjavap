package Exception;

public class Exception_demo {
	
public static void main(String args[])
{
	String str=null;
	try
	{
		
		System.out.println(str.length());
	}catch(Exception e)
	{
		System.out.println("Null value...line no 14");
	}
		
}
}
