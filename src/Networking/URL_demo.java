package Networking;

import java.io.*;  
import java.net.*;  
public class URL_demo{  
public static void main(String[] args){  
try{  
//URL url=new URL("http://pigateway.com:8080/default.aspx");  
URL url=new URL("https://www.youtube.com:1212/"); 
System.out.println("Protocol: "+url.getProtocol());  
System.out.println("Host Name: "+url.getHost());  
System.out.println("Port Number: "+url.getPort());  
System.out.println("File Name: "+url.getFile()); 


  
}catch(Exception e){System.out.println(e);}  
}  
}  