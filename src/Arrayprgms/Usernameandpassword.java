package Arrayprgms;

import java.util.Scanner;

public class Usernameandpassword {

	public static void main(String[] args) {
		String[][]ar=new String[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<2;i++)
		for(int j=0;j<2;j++)
		{
			ar[i][j]=sc.next();
		}
		
		
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
System.out.println();
		}

	}

}
