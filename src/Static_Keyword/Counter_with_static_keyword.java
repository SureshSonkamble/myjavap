package Static_Keyword;

public class Counter_with_static_keyword {

static int count=0;
	
Counter_with_static_keyword()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		Counter_with_static_keyword cwsk1=new Counter_with_static_keyword();
		Counter_with_static_keyword cwsk2=new Counter_with_static_keyword();
		Counter_with_static_keyword cwsk3=new Counter_with_static_keyword();
		Counter_with_static_keyword cwsk4=new Counter_with_static_keyword();
	}			
		
}
