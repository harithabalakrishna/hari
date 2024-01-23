package Controlstatements;

import java.util.Scanner;

public class Scannerprgm {

	public static void main(String[] args) {
		System.out.println("enter a number a");
		System.out.println("enter a number b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		
		System.out.println("enter a name");
	
	
		String c= sc.next();
		System.out.println("your name is "+c);
		
		int n=sc.nextInt();
		int tem=n;
		int rem;
		int rev=0;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(tem==rev)
		
		{System.out.println("the number is palindrom");}
		
		else 
		{
			System.out.println("the number is not palindrom");
			
		}

		
		

	}

}

