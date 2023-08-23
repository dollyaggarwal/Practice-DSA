package recursionaAssignment;
import java.util.Scanner;
public class MultiplicationWithoutMultiplyOperator {
	public static int multiplyTwoIntegers(int m, int n){

		 if( n==0)
	 return 0;
int multiply=m+multiplyTwoIntegers(m, n-1);	//add nth value then recursion for n-1 values
	return multiply;
	
		//Alternative approach 
	// if( n==0)
	//  return 0;
	// int mul=multiplyTwoIntegers(m, n-1); //recursion upto n-1 values
	// int multiply=mul+m; // add nth value at last
	// return multiply;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}
}
