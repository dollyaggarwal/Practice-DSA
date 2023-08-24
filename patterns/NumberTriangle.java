package patterns;

import java.util.Scanner;

public class NumberTriangle {

public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
	
		
		while(i<=n) {
			
			int spaces=1;
			while(spaces<=(n-i)) {
				
				System.out.print(" ");
				spaces=spaces+1;
			}
			int j=1;
			int p=i;
			while(j<=i)
			{
				System.out.print(p);
				j=j+1;
				p=p+1;
			}
			int k=i-1;
		
			while(k>=1)
			{
				System.out.print(k+i-1);
				
				k=k-1;
			
			}
			System.out.println();
			i=i+1;
		}
	}

}
