package Arrayprgms;

import java.util.Scanner;

public class Methodprm1 {

	public static void main(String[] args) {
		Methodprm1 ob=new Methodprm1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length l1");
		System.out.println("Enter the breadth b1");
		int l1=sc.nextInt();
		int b1=sc.nextInt();
		ob.area();
	}
		
		// Method without returntype and without parameter
		
		public void area()//triangle
		{
			double l1=40,b1=10;
			double c=(0.5)*(l1)*(b1);
			System.out.println(c);
			
		}
			
         
		
	

}

