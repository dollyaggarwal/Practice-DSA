package fundamentals;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
			
		Scanner s =new Scanner(System.in);

		int n=s.nextInt();
		int div=2;
		boolean isPrime=true;
		if(n>=0 && n<=10000) {
			
		while(div<n) {
			if(n%div==0)
			{	
				System.out.print(div+" ");

				isPrime=false;
				

			}
			div=div+1;
		}
		
		if(isPrime) {
		System.out.println("-1");
		}
		}
		else
		{
			System.out.println("Please enter a valid input");
		}
		
	}
}


