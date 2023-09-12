package Encapulation;


class emp
{
    int id;
	String name;
	
}
public class Demo_test1 {

	public static void main(String[] args) {
		
		emp e=new emp();
		int i=e.id=2;
	    String nm=e.name="Suresh";
		System.out.println(""+i);
		System.out.println(""+nm);


	}

}
