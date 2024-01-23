package Controlstatements;

public class Armstrong {

	public static void main(String[] args) {
		int i=153;
		int temp=i;
		int r,s=0;
		while(i>0)
		{
			r=i%10; //3
			s=s+r*r*r; //0+27
			i=i/10; //15
		}
		if(temp==s)
		{
			System.out.println("Amstrong");
		}else
		{
			System.out.println("Not Amstrong");
		}

	}

}
