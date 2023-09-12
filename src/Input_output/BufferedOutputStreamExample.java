package Input_output;
import java.io.*;  
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
	
     FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to tts for Android training...5/9/2019";    
     byte b[]=s.getBytes();   //at a time it will read 8 ch together 
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  