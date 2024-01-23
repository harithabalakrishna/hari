package Oopspkg;

public class Staticfinal2 {
static String companyname="Luminar";
final double pi=3.14;

///static final double pi=3.14  1.we can use static final double at a time now we do'nt want a object to call them
                               // 2.we can not change the value

public static void main(String[] args) {
	Staticfinal2 ob=new Staticfinal2(); 
	System.out.println(companyname);
	System.out.println(ob.pi);
	
	



}
}
