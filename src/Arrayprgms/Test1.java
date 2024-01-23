package Arrayprgms;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 ob= new Test1();
		
		double area1=ob.area();
		
		System.out.println("The area is "+ area1);
	}
	
	public double area()
	{
		int r=6;
		double c = (3.14)*r*r;
		return c ;
	}

}
