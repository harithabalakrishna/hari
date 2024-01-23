package Problemsjava;

import java.util.Scanner;

public class Problem3vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char s=sc.next().charAt(0);
		
		
			if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
			{
				System.out.println("Character is a vowel");
			}
			else
			{
				System.out.println("Character is a constant");
			}
				
		

	}

}
