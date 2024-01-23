package Exam;

public class Oddandeven {

	public static void main(String[] args) {
		
		int a[]= {1,2,7,9,4};
		System.out.println("Odd numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Even numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
