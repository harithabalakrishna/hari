package pkg;

public class Swapping {

	public static void main(String[] args) {
		int a=20, b=10, c;
		/*System.out.println("Before swapping value of a="+a +"\n"+"value of b="+b);
		c=a; //20
		a=b;
		b=c;
		System.out.println("After swapping value of a="+a +"\n"+"value of b="+b);*/
		
		a=a+b; //20=10=30
		b=a-b; //30-10=20
		a=a-b; //30-20=10
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		int d=23,e=45;
		System.out.println(d==e);
		
		int a1=55, b1=70;
		System.out.println(a1<50 && a1<b1);
		
		int c1=17;
		System.out.println(c1%10);
		
		int x=20 ,y=30;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x="+x);
		System.out.println("value of y="+y);
		
		
		
			
		
		
		
		

	}

}
