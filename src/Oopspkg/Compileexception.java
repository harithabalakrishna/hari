package Oopspkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Compileexception {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream ip=new FileInputStream("E://Book1.xlsx"); //compilation errors
		try {
			int c=5/0;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
		
		//Nullpoint Exception
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception details");
		}



	}

}
