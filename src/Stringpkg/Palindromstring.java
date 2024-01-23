package Stringpkg;

import java.util.Scanner;

import Oopspkg.Accessmodifier;

public class Palindromstring extends Accessmodifier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Accessmodifier
		Accessmodifier ob=new Accessmodifier();
		
		Palindromstring ob1=new Palindromstring();
		ob1.c=12;
		
		
        System.out.println("Enter a string");
        String s=sc.next(); //hellow
        String rev="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
			rev=rev+s.charAt(i); //o  //o+l=ol  //ol+l=oll  //oll+e=olle
		}
		System.out.println(rev);
	    if(rev.equals(s))
		{
			System.out.println("Palindrome");
		}
	    
	    else
	    {
	    	System.out.println("Not palindrome");
	    }
	
	}

}
