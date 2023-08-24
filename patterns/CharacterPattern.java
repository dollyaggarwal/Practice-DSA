package patterns;

import java.util.Scanner;

public class CharacterPattern {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			//char m='A';
			while(j<=n) {
				//System.out.print(m);
				char m=(char)('A'+j-1);
				System.out.print(m);
				//m=(char)(m+1);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
			
	}
}
