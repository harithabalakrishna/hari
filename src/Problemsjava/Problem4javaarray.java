package Problemsjava;

import java.util.Scanner;

public class Problem4javaarray {

	public static void main(String[] args) {
		int ar[]=new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++)
		{
			 ar[i]=sc.nextInt();
		}
		temp=ar[0];
		for(int i=0;i<5;i++)
		{
		if (temp<ar[i])
		{
		temp=ar[i];	
		}
		
		}
		System.out.println(temp);

	}

}
