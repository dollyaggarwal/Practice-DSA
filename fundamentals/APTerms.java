package fundamentals;

import java.util.Scanner;

public class APTerms {

	public static void main(String[] args) {
		int x ;	
		Scanner s =new Scanner(System.in);

		x=s.nextInt();
		for(int n=1;n<=x;n++)
		{
			int i=3*n+2;
			if(i%4==0) {
				x=x+1;
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
