package patterns;

import java.util.Scanner;

public class SumPattern {
	
	public static void main(String[] args) {
		
		Scanner s = new  Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int sum=0;
			int j;
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
				
				if(j!=i)
				{
					System.out.print("+");
				}
				 sum=sum+j;
			}
			System.out.print("="+sum);
			
			System.out.println();
		}
		
				

	}


}
