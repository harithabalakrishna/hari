package Arrayprgms;

import java.util.Scanner;

public class Countofintegers {

	public static void main(String[] args) {
		int countP=0,countN=0,countZ=0;
		int []ar=new int[10];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			if(ar[i]<0)
				countN++;
			else if(ar[i]>0)
				countP++;
			else
				countZ++;
		}
		System.out.println("Total number of positive numbers="+countP);
		System.out.println("Total number of negative numbers="+countN);
		System.out.println("Total number of zeros="+countZ);

	}

}
