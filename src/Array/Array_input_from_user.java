package Array;

import java.util.Scanner;

public class Array_input_from_user {
	 public static void main(String args[])
	    {
	        int[] a=new int[6];
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Please enter elements...");
	        for(int j=0;j<6;j++)
	            a[j]=sc.nextInt();
	        
	        
	        
	        System.out.println("Array elements are : ");
	        for (int i=0;i<a.length;i++)
	            System.out.println(a[i]);
	    }
}
