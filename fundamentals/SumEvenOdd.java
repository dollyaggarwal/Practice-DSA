package fundamentals;
import java.util.*;
import java.lang.*;

public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int rem=0;
		int even=0,odd=0;
		if(num>=0 && num<=100000000)
		{
			while(num>0) {
				rem=num%10;
				if(rem%2==0)
				{
					even=even+rem;
				}
				else
				{
					odd=odd+rem;
				}
				num=num/10;
				
			}
			System.out.println(even+"  "+odd);
		}
		else
		{
			System.out.println("please enter a valid input");
		}
		

	}

}
