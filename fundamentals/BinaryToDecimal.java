package fundamentals;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();

		int pv=1;

		int sum=0;

		while(num>0) {

			int	lastdig=num%10;
			lastdig=lastdig*pv;
			sum=sum+lastdig;
			num=num/10;
			pv=pv*2;


		}
		System.out.println(sum);


	}	


}


