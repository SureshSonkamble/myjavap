package Practice;

import java.util.Scanner;

public class ExArraySortElement 
{
	public static void main(String[] args) 
	{
		int n, temp;
		//scanner class object creation
		Scanner s = new Scanner(System.in);

		//input total number of elements to be read
		System.out.print("Enter the elements you want : ");
		n = s.nextInt();

		//integer array object
		int a[] = new int[n];

		//read elements 
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}

		//sorting elements
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] > a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		//print sorted elements 		
		System.out.println("Ascending Order:");
		for (int i = 0; i < n ; i++) 
		{
			System.out.println(a[i]);
		}
	}   
}