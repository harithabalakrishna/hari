package Oopspkg;                                      

interface TVremote                       //create an interface tvremote and use it to inherit another interface smarttvremote
                                         //create a class TV which implements smarttvremote interface
{
  public void volume();
  void switchoff();
  
}
 
interface SmartTVremote extends TVremote
{
	
	public void size();
	void colour();
}
class TV implements SmartTVremote
{

	@Override
	public void volume() {
		System.out.println("Volumn up and down");
		
	}

	@Override
	public void switchoff() {
	System.out.println("Switch on or off");
		
	}

	@Override
	public void size() {
		System.out.println("Size of remote");
		
	}

	@Override
	public void colour() {
		System.out.println("clolour of remote");
		
	}
	
	 
		
	
}
public class Interfacetv {                         

	public static void main(String[] args) {
		TV ob=new TV();
		ob.volume();
		ob.switchoff();
		ob.size();
		ob.colour();
		
		

	}
}


