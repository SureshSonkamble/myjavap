package Static_Keyword;

public class Counter_withaout_static_keyword {

	int count=0;
	
	Counter_withaout_static_keyword()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		Counter_withaout_static_keyword cwsk1=new Counter_withaout_static_keyword();
		Counter_withaout_static_keyword cwsk2=new Counter_withaout_static_keyword();
		Counter_withaout_static_keyword cwsk3=new Counter_withaout_static_keyword();
		
				

	}
}
