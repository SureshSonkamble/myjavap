
import java.util.Scanner;

public class Alphabet_chk
{
    public static void main(String args[])
    {
    	String awnser="";
    	do{
        char ch,chk;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.println(ch + " is not an Alphabet");
        }
        System.out.println("\n");
        System.out.println("do you want to continue?");
        awnser=scan.next();
    }while(awnser.equals("y"));
    }
}