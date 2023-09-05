package fundamentals;

import java.util.Scanner;

public class PrimeNosUptoN {

	public static void main(String[] args) {
		
		int n;	
		Scanner s =new Scanner(System.in);

		n=s.nextInt();
		int i,j;
		if(n>=1 && n<=100) {
			
		
		for(i=2;i<=n;i++)
		{
			for( j=2;j<n;j++) {
				if(i%(j)==0)
					break;
			}
			if(j==i) {
				System.out.println(i);
			}
		}
		}
		else {
			System.out.println("enter a valid number...");
		}

	}

}
