package patterns;
import java.util.*;

public class squarePattern {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}