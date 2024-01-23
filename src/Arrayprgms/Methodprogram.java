package Arrayprgms;

import java.util.Scanner;

public class Methodprogram {

	public static void main(String[] args) {
		
		Methodprogram ob=new Methodprogram();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int V1=sc.nextInt();
		int V2=sc.nextInt();
		ob.add();
		int subanswer=ob.sub();
		System.out.println(subanswer);
		ob.mul(V1,V2);
		System.out.println(ob.div(V1,V2));
		
	}
	
	// Method without returntype and without parameter
	
	public void add()
	{
		int a=40,b=10,c;
		c=a+b;
		System.out.println(c);
		
	}
	
	// Method with return type and without parameter
	
	public int sub()

	{
		int a=40,b=10,c;
		c=a-b;
		return c;
	}
	
	
	//Method without returntype and with parameter
	
	public void mul (int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	
	//Method with returntype and with parameter
	
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
		
		
		
	}
}
		
		
		
		

	

	

	