package fundamentals;
import java.util.Scanner;
public class MaxNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int max=0;

		for(int i=1;i<n;i*=10){
			int rem=n%i;

			int max1=n/(10*i)*i+rem;

			if(max<max1)
				max=max1;
		}

		System.out.println(max);
		
		//Alternative method

		//	 int max = 0;
		//	     for (int i = 1; i < n; i *= 10) {
		// max1= n % i + n / (i * 10) * i
		//	         max = Math.max(max,max1);
		//	     }
		//	     return max;


	}

}
