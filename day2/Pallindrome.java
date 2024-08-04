package week1.day2;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pallindrome series ->121
		int input= 1211; //
		
		int temp;
		
		temp = input;
		
		int rev =0; //121
		
		for(;input!=0; input=input/10) {
			
			
			rev = rev * 10 + input%10;
			
			// 120+1
			
		}
		
		if(rev==temp) {
			
			System.out.println(temp+ " is a palinddrome number");
		}
		else {
			System.out.println(temp+ " is a not palinddrome number");
			
		}

	}

}
