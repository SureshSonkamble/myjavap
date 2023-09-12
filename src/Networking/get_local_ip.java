package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class get_local_ip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getLocalHost();
			 System.out.println("IP Address:- " + inetAddress.getHostAddress());
		        System.out.println("Host Name:- " + inetAddress.getHostName());      
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	}

}
