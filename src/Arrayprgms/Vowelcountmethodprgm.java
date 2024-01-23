package Arrayprgms;

import java.util.Scanner;

public class Vowelcountmethodprgm {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Vowelcountmethodprgm v=new Vowelcountmethodprgm();
		int count=v.vowelCount(s);
		System.out.println("count="+count);
		
		}
	public int vowelCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
      
}
