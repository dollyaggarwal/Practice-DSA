package patterns;
import java.util.*;
public class NumberStar {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(n-j+1);}	
				System.out.print("*");
				
				for(int k=1;k<i;k++) {
					
					System.out.print(i-k);
			}
				
		
		System.out.println();
		}

	}

}
