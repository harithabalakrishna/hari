package Arrayprgms;

import java.util.Scanner;

public class Sumandaverage {

	public static void main(String[] args) {
		int sum=0,average=0;
	int[]ar=new int[3];
	System.out.println("Enter the numbers");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		ar[i]=sc.nextInt();
		sum=sum+ar[i];		
	}
System.out.println("Sum of the numbers="+sum);
System.out.println("Average of the numbers="+sum/3);

	

	}

}
