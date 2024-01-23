package Oopspkg;
class Emp
{
	private String empname;                              //add getter and setter from source
	private String empdesgnation;                        //encapsulation is used to more secured
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesgnation() {
		return empdesgnation;
	}
	public void setEmpdesgnation(String empdesgnation) {
		this.empdesgnation = empdesgnation;
	}
	
}





public class Encapsulation {

	public static void main(String[] args) {
		Emp ob=new Emp();                               
		ob.setEmpname("Krishna");
		ob.setEmpdesgnation("Tester");
		System.out.println(ob.getEmpname());                               //set is used to set anything and 
		System.out.println(ob.getEmpdesgnation());                         //get top display
		

	}

}
