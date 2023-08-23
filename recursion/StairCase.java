package recursionaAssignment;
import java.util.*;
public class StairCase {
	  public static int staircase(int n){
			if(n<0){
			return 0;
			}
			else if(n==0){
				return 1;
			}
			int x=staircase(n-1);
			int y=staircase(n-2);
			int z=staircase(n-3);
			int ans=x+y+z;
			return ans;


		}
	  public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println(staircase(n));
		}
}
