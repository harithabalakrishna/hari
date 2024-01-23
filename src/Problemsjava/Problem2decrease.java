package Problemsjava;

import java.util.Scanner;

public class Problem2decrease {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number");
		double x=sc.nextDouble();
		System.out.println("Input the second number");
		double y=sc.nextDouble();
		System.out.println("Input the third number");
		double z=sc.nextDouble();
		if(x<y&&y<z)
		{
			System.out.println("increasing");
		}
		else if(x>y&&y>z)
		{
			System.out.println("decreasing");
		}
		else
		{
			System.out.println("Neither decreasing nor increasing");
		}
		
		
		
		
		

	}

}
