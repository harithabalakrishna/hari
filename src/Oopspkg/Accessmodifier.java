package Oopspkg;

public class Accessmodifier {
	
	private int a;   //only within the class
	int b;  //within the class and within the pkg
	protected int c;  //within the class,within the pkg and outside pkg by subclass only
	
	
	public static void main(String[] args) {
		
		Accessmodifier ob=new Accessmodifier();
		ob.a=20;
		ob.b=30;
		ob.c=12;
		
		
		

	}

}
