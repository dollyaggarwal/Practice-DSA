package patterns;

import java.util.*;

public class DiamondStars {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);

		double n=s.nextDouble();
if((n>=1 && n<=49) && (n%2!=0))
{
	

		int i=1;
		int n1=(int)(Math.round(n/2));
		
		while(i<=n1) {
			
			int spaces=1;
			while(spaces<=(n1-i)) {

				System.out.print(" ");
				spaces=spaces+1;
			}
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j=j+1;
			}
			int k=i-1;
			while(k>=1)
			{
				System.out.print("*");
				k=k-1;
			}
			System.out.println();
			i=i+1;
		}
		
		int i1=1;
		int n2=(int)(n-n1);
		
		while(i1<=n2) {
			int spaces1;
			spaces1=i1;
			while(spaces1>=1)
			{
				System.out.print(" ");
				spaces1=spaces1-1;
			}

			int m=1;

			while(m<=(n2-i1+1)) {

				System.out.print("*");

				m=m+1;
			}
			int p=1;

			while(p<=(n2-i1)) {

				System.out.print("*");
				p=p+1;
			}
		
		System.out.println();
		i1=i1+1;
	}
}
else {
	System.out.println("Please enter a valid odd number...");
}
	}

}




