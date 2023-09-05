package fundamentals;
import java.util.*;
public class PowerOfNum {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int i=2;
		if((x>=0 && x<=8) && (n>=0 && n<=9))
		{
			if(n==0)
			{
				System.out.println("1");
			}
			else if(x==0 && n==1) {
				System.out.println(x);
				
			}
			else {
				int num=x;
			
				while(i<=n)
				{
					
					num=num*x;
					i+=1;
				}
				System.out.println(num);
			}
		}
		else {
			System.out.println("Please enter valid input");
		}
		
		
	}

}
