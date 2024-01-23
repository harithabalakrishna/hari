package Arrayprgms;

import java.util.Scanner;

public class Methodprgm2 {

	public static void main(String[] args) {
		Methodprgm2 ob=new Methodprgm2();

		double a=ob.area();
		
		System.out.println("The area is "+ a);
	}
		
		
		
		// Method with returntype and without parameter 
		
				public double area () //circle

				{
					int r;
					r=6;
					double c= (3.14)*r*r;
					return c;
				}

	}


