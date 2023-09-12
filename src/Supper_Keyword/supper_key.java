package Supper_Keyword;

class gcolor
{
	String color="Grren";
}
class pcolor extends gcolor
{
	String color="White";
}
class ccolor extends pcolor
{
	String color="Black";
	void show_color()
	{
		System.out.println(super.color);
	}
}

public class supper_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ccolor cl=new ccolor();
		//System.out.println(cl.color);
		cl.show_color();
	}

}
