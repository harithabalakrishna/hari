package Exam;



public class Duplicate {

	public static void main(String[] args) {
		int[]ar=new int[] {2,4,9,4,6,6,5};
		System.out.println("Duplicate elements are=");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
					System.out.println(ar[i]);
					
			}
		}
		

		
		

	}

}
