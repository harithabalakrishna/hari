package Stringpkg;

import java.util.Scanner;

public class Vowelscountstring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char[] c=s.toCharArray();
		int vowel=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vowel++;
		}
           System.out.println("Total no of vowels in a string="+vowel);
	}

}
