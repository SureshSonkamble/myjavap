package Encapulation;


class stud
{
   private	int id;
   private	String name;
   
   public void setId(int i_d)
   {
	   System.out.println("Id Accessed by user...");
	   id=i_d;
   }
   
   public int getId()
   {
	   return id;
   }
	
}
public class Demo_test2 {

	public static void main(String[] args) {
		
		stud s=new stud();
	     //s.id=2;
		s.setId(5);
		System.out.println(s.getId());

	}

}
