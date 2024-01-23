package Oopspkg;

class parent
{
	public void display()
	
	{
		System.out.println("display method");
	}

}
class child extends parent
{
	public void childmthd()
	
	{
		System.out.println("child details");
		
	}
	
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		
		child c=new child();
		c.display();
		c.childmthd();
		
	}

}
