package Array;

import java.util.Scanner;

public class array_search_cnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5]; 
		int n,cnt=0;
		System.out.println("Enter 5 element of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the number to be search");
		n=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				cnt++;
			}
			
		}
		System.out.println(""+cnt);
		}
		
		
	}


