package Input_output;


import java.io.FileReader;
import java.io.IOException;

public class File_read {
	public static void main(String args[]) //throws IOException  
	{
		try{
	FileReader fr =new FileReader("D:\\diploma.txt");
	int ch = fr.read();
	//System.out.println(ch);
	//System.out.print((char)ch);

	while(ch != -1)
	{		
	System.out.print((char)ch);
	//System.out.println(ch);
		ch=fr.read();
		}
	fr.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
