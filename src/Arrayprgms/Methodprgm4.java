package Arrayprgms;

import java.util.Scanner;

public class Methodprgm4 {

	public static void main(String[] args) {
		Methodprgm4 ob=new Methodprgm4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		System.out.println("Enter the breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		double z=  ob.area(l,b);
		System.out.println(z);
		
		
		

	}

	public double area(int l, int b)  //rectangle
	{
		
	double c=l*b;
	return c;
		
	}

}
