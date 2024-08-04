package week1.day2;

public class FindOddnumbers {
 
	public static void main(String[] args) {
		//to find the odd number which should be %2 and Remainder should be ==1
		
		int maxrange=10;
		for (int i=1; i<=maxrange; i++)
			
		{
			if(i%2==1) {
				System.out.println("the given number is" +" " +i +" "+ "odd");
			
		}
			else {System.out.println("the given number is even" + " "+i );
			}
			}

}
}
