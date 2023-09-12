package Practice;

public class Minfromarray {

	public static void main(String args[])
	{
		
		int a[]={22,3,4,5,66,7,1,55};
		try{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}catch(Exception e)
		{
		}
		
		int min=a[0];  
		for(int i=1;i<a.length;i++)  
		{
		 if(min>a[i])  
		  min=a[i];  
		
		}
		 System.out.println("Minimum number from array:"+min);
		
		
	}
}
