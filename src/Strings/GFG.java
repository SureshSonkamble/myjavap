package Strings;
import java.util.*;
class GFG {
	// Declare a global list
	static List<String> al = new ArrayList<>();
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input number");
		String s =sc.next();
		findsubsequences(s, ""); // Calling a function
		System.out.println(al);
	}
	private static void findsubsequences(String s,
										String ans)
	{
		if (s.length() == 0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));
		findsubsequences(s.substring(1), ans);
		
	}
}
