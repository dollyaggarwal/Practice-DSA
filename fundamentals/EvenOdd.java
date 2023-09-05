package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 int a,b;
		 a=s.nextInt();
		 int rem= a % 2;
		 boolean result =rem==0;
		 if(result) {
			 System.out.println(a + " is even");
		 }
		 else
			 System.out.println(a + " is odd");
	 
			 
		 
	}

}
