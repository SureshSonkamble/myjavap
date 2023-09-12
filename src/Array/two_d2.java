package Array;

import java.util.Scanner;

public class two_d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]=new int [2][2];
        int b[][]=new int [2][2];
        int c[][]=new int [2][2];
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        
       
        for(int i=0;i<2;i++)
        	{
        	System.out.println("\n");
        		for(int j=0;j<2;j++)
        		{
        			System.out.print("  "+a[i][j]);
        		}
        	}
        
        //==================
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the value for second fmatrix");
        for(int i=0;i<2;i++)
    	{
    	System.out.println("\n");
    		for(int j=0;j<2;j++)
    		{
    			
    			b[i][j]=sc.nextInt();
    		}
    	}
        for(int i=0;i<2;i++)
    	{
    	System.out.println("\n");
    		for(int j=0;j<2;j++)
    		{
    			System.out.print("  "+b[i][j]);
    		}
    	}
       //================= 
        for(int i=0;i<2;i++)
    	{
    	System.out.println("\n");
    		for(int j=0;j<2;j++)
    		{
    			c[i][j]=a[i][j]+b[i][j];
    			
    		}
    		
    	}
        
        for(int i=0;i<2;i++)
    	{
    	System.out.println("\n");
    		for(int j=0;j<2;j++)
    		{
    			System.out.print("  "+c[i][j]);
    		}
    	}
    
        }
        
	}


