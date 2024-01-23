package Controlstatements;

public class Nestedif {

	public static void main(String[] args) {
		int a=120;
		if(a%5==0)
		{
			if(a%11==0)
			{
				System.out.println(" a is divissible by 5 and 11");
			}
			else
			{
				System.out.println("a is divissible by 5 not 11");
				
			}
		
	}
			else
			{
			System.out.println("a is not divisible by 5");
		}
	}
}
		

	


