package week1.day2;

import java.util.Iterator;

public class fiboseries {

	public static void main(String[] args) {
		int a=0,b=1,c=2, sum=15;
		int d;
		int e;
		System.out.print(a+" "+b+" ");
		
		for(int i=2; i<=sum; ++i)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(b+""+" ");
			
			
			
			
		}
		 
		
		

	}

}
