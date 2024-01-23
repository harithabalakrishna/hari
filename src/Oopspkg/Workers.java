package Oopspkg;

class Members {
	String name;
	int age;
	int phoneno;
	String address;
	int salary;


public void printdetails()

{
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("phoneno="+phoneno);
	System.out.println("addess="+address);
	System.out.println("salary="+salary);
	
}
}
 class Employee1 extends Members
 
	 
	 {
		 String specialization;
	 }
 
 class Manager extends Members
 
	 
	 {
		 String Department;
	 }




public class Workers {

	public static void main(String[] args) {
		Employee1 ob1=new Employee1();
		Manager ob2=new Manager();
		ob1.name="Balan";
		ob1.age=50;
		ob1.phoneno=989510;
		ob1.address="My address";
		ob1.salary=50000;
		ob1.specialization="Testing";
		ob1.printdetails();
		
		System.out.println();
		
		
		ob2.name="Sunitha";
		ob2.age=40;
		ob2.phoneno=974724;
		ob2.salary=25000;
		ob2.Department="HR";
		ob2.printdetails();
		
	
		

	}

}
