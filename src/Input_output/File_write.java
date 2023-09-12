package Input_output;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File_write {
	public static void main(String args[]) throws Exception
	{
		String fname;
		 Scanner scan = new Scanner(System.in);
		System.out.println("Enter Data");
		fname=scan.nextLine();
	File f =new File("D:\\chinmay.txt");//file create
	FileWriter fw=new FileWriter(f);
	//String s = "VS Programming Instute Nashik....10/24/2020";
	
	char ch[]=fname.toCharArray();
	fw.write(ch);
	fw.close();	
	System.out.println("success");  
	}
}
