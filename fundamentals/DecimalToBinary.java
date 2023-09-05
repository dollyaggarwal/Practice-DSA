package fundamentals;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
			Scanner s =new Scanner(System.in);
			int num=s.nextInt();
			int rev=0;
			int pv=1;
			while(num>0) {
				int rem=num%2;
				rev=rev+rem*pv;
				num=num/2;
				pv=pv*10;
			}
			
System.out.println(rev);

	}

}
