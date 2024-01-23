package Controlstatements;

import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String a=sc.next();
		
		System.out.println("v for violet");
		System.out.println("i for indigo");
		System.out.println("b for blue ");
		System.out.println("g for green ");
		
		System.out.println("enter your choice");
		
		int b=sc.nextInt();
		
		
		
		switch(b)
		{
		case 1:System.out.println("violet");
		break;
		case 2:System.out.println("indigo");
		break;
		case 3:System.out.println("blue");
		break;
		case 4:System.out.println("green");
		break;
		default:System.out.println("invalid expression");

		}
	}

}
