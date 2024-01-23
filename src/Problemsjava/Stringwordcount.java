package Problemsjava;

public class Stringwordcount {

	public static void main(String[] args) {
		
			String s="Testing Training Center";
			int count=1;
			int i=1;
			while(i<s.length())
			{
				if((s.charAt(i))==' '&&(s.charAt(i+1)!=' '))
				{
					count++;
				}
				i++;
			}
			System.out.println("Total number of words="+count);
			

	}

}
