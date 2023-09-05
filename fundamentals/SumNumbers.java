package fundamentals;
import java.util.Scanner;
public class SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int n;
		n=s.nextInt();
		
		int i=1;
		int sum=0;
		while(i <=n)
		{
			sum=sum+i;
			i=i+1;
	}
		System.out.println(sum);
}
}
	
