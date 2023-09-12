package Input_output;
	
	import java.io.FileInputStream;  
	public class FileInputStream_demo {  
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("D:\\tts.txt");    
	            int i=fin.read();  
	            System.out.print((char)i);    //read single character
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	     }