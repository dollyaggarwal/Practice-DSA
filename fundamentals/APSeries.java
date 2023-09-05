package fundamentals;

import java.util.Scanner;

public class APSeries {

	public static void main(String[] args) {
		int num ;	
		Scanner s =new Scanner(System.in);

		num=s.nextInt();
		int i=3;
		int prev=s.nextInt();
		int next=s.nextInt();
		int diff=next-prev;
		
		while(i<=num) {
		
			prev=next;
			next=s.nextInt();
			
			if(next-prev!=diff){
				System.out.println("false");
				return;
			}
		
			i++;
			
			
		}
      System.out.println("true");
}
}
