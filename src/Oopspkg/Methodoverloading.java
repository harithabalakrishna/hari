package Oopspkg;

public class Methodoverloading { // same formula in different methods

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add (20,10);
		ob.add();
		ob.add(2.3,5);
		ob.add(4,3.2);
		
	}
public void add()
{
	int a=20,b=30,c;
	c=a+b;
	System.out.println(c);
}
		
public void add (int a, int b)
{
	int c=a+b;
	System.out.println(c);
	
}
public void add (int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
		
public void add (double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
		
		
		
		
	}


