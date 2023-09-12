package Networking;

import java.io.*;  
import java.net.*;  
public class Ip_Address{  
public static void main(String[] args){  
try{  
	//all_ip alp=new all_ip();
	//alp.getNetworkIPs();
//InetAddress ip=InetAddress.getByName("tts_PC_05"); //get ip from pc name 
//InetAddress ip=InetAddress.getByName("192.168.137.252"); //get mobile name form ip 
//InetAddress ip=InetAddress.getByName("RedmiNote5-Redmi.mshome.net");//get ip  form mobile name 
InetAddress ip=InetAddress.getByName("www.vsproi.com");//get ip  form host name
System.out.println("Host Name: "+ip.getHostName());  

System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}  
}