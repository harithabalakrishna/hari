package Arrayprgms;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String[]ar=new String[3];
		System.out.println("Enter names");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("Entered names");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}


	}

}
