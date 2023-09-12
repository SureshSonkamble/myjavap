package Exception;

public class exp_test {

	public static void main(String[] args) {
		
		String str=null;	
		
		try{
			
			System.out.println(str.length());
			
		}catch(Exception e)
		{
			System.out.println("Null value 100 line no.");
		}

	}

}
