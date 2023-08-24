package patterns;

import java.util.Scanner;

public class ReverseCharPattern {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int l=n;
		while(i<=n) {
			
			int j=1;
			
			char m=(char)('A'+l-1);
			l=l-1;
			while(j<=i) {
				
				System.out.print(m);
				m=(char)(m+1);
				
				j=j+1;
			}
			
			System.out.println();
			i=i+1;
			
			
		}
			
	}

}
