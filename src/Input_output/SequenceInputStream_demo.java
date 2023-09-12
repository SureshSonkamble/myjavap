package Input_output;

import java.io.*;  
class SequenceInputStream_demo {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("D:\\akash.txt");   
   FileInputStream input2=new FileInputStream("D:\\Sanjali.txt");    
   

   SequenceInputStream inst=new SequenceInputStream(input1, input2);   
   System.out.println("");
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    