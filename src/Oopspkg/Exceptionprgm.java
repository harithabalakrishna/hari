package Oopspkg;

public class Exceptionprgm {

	public static void main(String[] args) {
		
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
