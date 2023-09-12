package Inheritance;

class gprnt
{
	String surname="Sonkamble";
}

class prnt extends gprnt
{
	String pname="Daulat";
    void pname()
    {
    	System.out.println("name="+pname+surname);
    }
}

class chld extends prnt
{
	String name="Suresh";
	void full_name()
	{
		System.out.println("Full name="+name+" "+pname+" "+surname);
	}
}
public class inhrit_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chld c=new chld();
		c.pname();
		c.full_name();
	}

}
