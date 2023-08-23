package recursionaAssignment;
import java.util.Scanner;
public class SumOfDigits {
	public static int sumOfDigits(int input){
	if(input==0)
	return 0;
	int lstdig=input%10;//last digit
	int remainingnum=input/10;//find remaining nu
	int sum=lstdig+sumOfDigits(remainingnum);
	return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}
}
