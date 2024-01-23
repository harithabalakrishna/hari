package Controlstatements;

import java.util.Scanner;

public class Classtest4 {

	public static void main(String[] args) {
		int sum;
		char choice;
		Scanner s=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the first digit");
			int a=s.nextInt();
			
			System.out.print("Enter the second digit");
			int b=s.nextInt();
			
			sum=a+b;
			
			System.out.println("The sum is"+ sum);
			
			System.out.println("\nEnter your choice \nY for yes and N for No");
			choice=s.next().charAt(0);
		}
		while((choice=='Y')|| choice=='y');

	}

}
