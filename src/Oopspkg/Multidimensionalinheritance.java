package Oopspkg;

	class animal
	{
		public void animalmethod()
		{
			System.out.println("animal details");
		}
	}
	
	class dog extends animal
	{
		public void dogmethods()
		{
			System.out.println("dog details");
		}
	}
	class babydog extends dog
	{
		public void babydogmethods()
		{
			System.out.println("babydog details");
		}
	}
	
	
	
	
    public class Multidimensionalinheritance { 
	public static void main(String[] args) {
		babydog c=new babydog();
		c.animalmethod();
		c.dogmethods();
		c.babydogmethods();
		

	}

}
