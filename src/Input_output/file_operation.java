package Input_output;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_operation
{
	 static String fname;
    public static void main(String args[])throws Exception
    {
        float a, b, res;
        char choice, ch;
         String fwrite;
        Scanner scan = new Scanner(System.in);
		
        do
        {
            System.out.print("1. Create File\n");
            System.out.print("2. Write File\n");
            System.out.print("3. Read File\n");
            System.out.print("4. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' : 
                	try {
                		System.out.println("Enter File Name");
                		fname=scan.next();
                    File myObj = new File("D://"+fname+".txt");
                    if (myObj.createNewFile()) {
                      System.out.println("File Created Sucess: " + myObj.getName());
                    } else {
                      System.out.println("File already exists.");
                    }
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                    break;
                case '2' : 
                	
                	File f =new File("D:\\"+fname+".txt");//file create
            	FileWriter fw=new FileWriter(f);
            	String s = "VS Programming Instute Nashik college road....5/11/2022";
            	
            	char c[]=s.toCharArray();
            	fw.write(c);
            	fw.close();	
            	System.out.println("File Write Successfully..");  
                    break;
                case '3' : try{
                	FileReader fr =new FileReader("D:"+fname+".txt");
                	
                	int chh = fr.read();
                	//System.out.println(ch);
                	//System.out.print((char)ch);

                	while(chh != -1)
                	{		
                	System.out.print((char)chh);
                	//System.out.print(ch);
                		chh=fr.read();
                		}
                	fr.close();
                		}catch(Exception e){
                			System.out.println(e);
                		}
                	
                    break;
               
                case '4' : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5);       
    }
}