package fundamentals;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String n=s.next();
		char name=n.charAt(0);
		
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(name);
		System.out.println(avg);


	}

}
