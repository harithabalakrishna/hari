package Stringpkg;

public class Stringproblem1 {

	public static void main(String[] args) {
		
		String s="hello world";    //change hello to hai
		
		System.out.println(s.replace("hello", "hai"));
		
		
		
		
		// testing training center to center training testing
		
		String s2="Testing training center";
		String temp="";
		String [] st=s2.split(" ");
		
		for (int i=st.length-1;i>=0;i--)
		{
			temp=temp+st[i]+" ";
		}
		System.out.println(temp);

	}

}
