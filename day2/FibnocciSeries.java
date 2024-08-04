package week1.day2;

public class FibnocciSeries {

	public static void main(String[] args) {
		 int a1=0, a2=1,  n=8;
		 int a3;
		 int a4;
		 int a5;
		 System.out.print(a1+" "+a2+" ");
		 
		 for (int i=3;i<=n;i++)
		 {
		    a3 = a1+a2;
			a1=a2;
			a2=a3;
		
			System.out.print(a2+ " ");
			 
					 
			 
			
		 }
		 
				 

	}

}
