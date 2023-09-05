package fundamentals;
import java.util.Scanner;
public class PrimeNos {
	public static boolean checkPrime(int n) {
		int div=2;

		while(div<=n/2) {
			if(n%div==0)
			{	
				return false;

			}
			div=div+1;
		}
		return true;
	}
	//alternative method

	public static boolean checkPrime2(int n) {
		int div=2;
		boolean isPrime=true;
		while(div<=n/2) {
			if(n%div==0)
			{	
				isPrime=false;
				break;
			}
			div=div+1;
		}
		return isPrime;
		//		if(isPrime) {
		//			return true;
		//		}
		//		else
		//			return false;
	}

	public static void main(String[] args) {
		int n;	
		Scanner s =new Scanner(System.in);

		n=s.nextInt();

		boolean isPrime=checkPrime(n);

		System.out.println(isPrime);

		boolean isPrime1=checkPrime2(n);

		System.out.println(isPrime1);

	}
}


