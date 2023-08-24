package patterns;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner s = new  Scanner (System.in);
		int n=s.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			int p=(2*i)-1;
//		for(int j=n; j>0;j--){
//			System.out.print(p);
//			p=p+2;
//			int maxval=(2*n)-1;
//			if(p>maxval)
//			{
//				p=1;
//			}
//				
//			}
//		
//		System.out.println();
//		}
		int i=1;
		while(i<=n) {
			int num=(2*i)-1;
			int j=1;
			while(j<=(n-i+1)) {
				System.out.print(num);
				num=num+2;
				j++;
			}
			int k=1;
			while(k<=(2*i-2)) {
				System.out.print(k);
				k=k+2;
			}
			i++;
			System.out.println();
		}
		

	}
}
