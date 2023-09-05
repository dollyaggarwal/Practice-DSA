package fundamentals;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		int num ;	
		Scanner s =new Scanner(System.in);

		num=s.nextInt();
		int n=num;
		
		int rev=0;
		while(num>0) {	
			
			int lastdig=num%10;

			rev=rev*10+lastdig;
			
			num=num/10;
		}
		if(rev==n)
		System.out.println("true");
		else
			System.out.println("false");

	}

}
