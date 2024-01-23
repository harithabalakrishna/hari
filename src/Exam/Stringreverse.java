package Exam;

public class Stringreverse {

	public static void main(String[] args) {
		String s="LUMINAR";
		String rev=" ";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println("Reversed String="+rev);

	}

}
