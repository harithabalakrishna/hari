package Problemsjava;

import java.util.Scanner;

public class Sumofinteger {

	public static void main(String[] args) {
		int number,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("Sum of the digits="+sum);
		

	}
	

}
