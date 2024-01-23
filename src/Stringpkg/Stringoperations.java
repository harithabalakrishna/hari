package Stringpkg;

public class Stringoperations {

	public static void main(String[] args) {
		
		
		
		//Concate
		
		String s="hello";
		String s1 ="welcome";
		String s3 ="Hello welcome";
		System.out.println(s+s1);//hellowelcome
		System.out.println(2+3+s+5+6);//5hello56
		
		
		//Equals
		
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s3));
		
		
		//Contains
		
		System.out.println(s3.contains("welcome"));
		
		
		//toUppercase and toLowercase
		
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		//Length
		
		System.out.println(s.length());
		
		
		//Startswith and endswith
		
		
		System.out.println(s3.startsWith("hello"));
		System.out.println(s3.endsWith("welcome"));
		
		
		//Trim
		
		System.out.println(s1.trim());
		
		//Replace
		
		System.out.println(s3.replace("hellow", "hi"));
		
		//Subsring (startindex start with 0 and endindex start with 1)
		
		System.out.println(s.substring(1,3));
		
		
		//Split
		
		String s4="hello welcome to luminar technolab";
		String[] st=s4.split(" ");
		for(String e:st)
		{
			System.out.println(e);
		}
		
		
		//tocharArray
		
		String s5="hello";
		char[] c=s5.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
		
	
		
		
	
		
		
	}

}
