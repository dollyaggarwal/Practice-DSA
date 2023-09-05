package fundamentals;

import java.util.Scanner;

public class SumProduct {

	public static void main(String[] args) {
		int n ;	
		Scanner s =new Scanner(System.in);

		n=s.nextInt();
		
		if(n>=1 && n<=12) {
			int c=s.nextInt();
			int sum=0;
			int pro=1;
			
		if(c==1) {
			for(int i=1;i<=n;i++)
			sum=sum+i;
			System.out.println(sum);
		}
		else if(c==2) {
			for(int i=1;i<=n;i++) 
				pro=pro*i;
				System.out.println(pro);
			
		}
		else
			System.out.println(-1);

	}
	
	else
	System.out.println("please enter avalid number...");
	}

}
