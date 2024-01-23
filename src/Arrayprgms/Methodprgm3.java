package Arrayprgms;

import java.util.Scanner;

public class Methodprgm3 {

	public static void main(String[] args) {
		Methodprgm3 ob=new Methodprgm3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the side");
		int a=sc.nextInt();
		ob.area(a);
	}
		
		
		
		//Method without returntype and with parameter
		
		

	
	
	public void area(int a)
	{
		int c=a*a;
		System.out.println(c);
	}

}
