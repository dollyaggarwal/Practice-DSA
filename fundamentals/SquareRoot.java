package fundamentals;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		int n=1;
		while(n<=num) {
			i=i+1;
			n=i*i;	
		}
		System.out.println((i-1));

	}

}
