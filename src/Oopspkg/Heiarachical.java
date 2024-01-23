package Oopspkg;

class animal1
{
	public void animalmethod()
	{
		System.out.println("animal1 details");
	}
}

class tiger extends animal1
{
	public void tigermethods()
	{
		System.out.println("tiger details");
	}
}
class deer extends animal1
{
	public void deermethods()
	{
		System.out.println("deer details");
	}
}

public class Heiarachical {

	public static void main(String[] args) {
		tiger c=new tiger();
		c.animalmethod();
		c.tigermethods();
		deer c1=new deer();
		c1.animalmethod();
		c1.deermethods();
		
		

	}

}
