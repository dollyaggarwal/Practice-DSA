package patterns;

	import java.util.*;

public class HlafDiamondNumberStar {
	 public static void main(String[] args) {
			Scanner s =new Scanner(System.in);

			int n=s.nextInt();
	if((n>=0 && n<=50))
	{
		 
		 System.out.println("*");
			int i=1;
		
			
			while(i<=n) {
				
				 System.out.print("*");
				int j=1;
				while(j<=i)
				{
					System.out.print(j);
					j=j+1;
				}
				int k=i-1;
				while(k>=1)
				{
					System.out.print(k);
					k=k-1;
				}
				 System.out.print("*");
				 
				System.out.println();
				i=i+1;
			}
			
			int i1=1;
			int n1=n-1;
			
			while(i1<=n1) {
				
				 System.out.print("*");
				int m=1;
				
				while(m<=(n1-i1+1)) {
	           
	          
					System.out.print(m);

					m=m+1;
				}
				
				int p=n-i1-1;
				

				while(p>0) {

					System.out.print(p);
					p=p-1;
				}
				
				 System.out.print("*");
			System.out.println();
			i1=i1+1;
		}
			 System.out.println("*");
	}
	else {
		System.out.println("Please enter a valid number...");
	}
		} 

}
