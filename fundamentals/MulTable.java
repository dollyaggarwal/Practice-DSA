package fundamentals;
import java.util.*;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		if(n>=0&&n<=10000)
		{
		while(i<=10)
		{
			System.out.println(n*i);
			i+=1;
		}
		
	}else {
		System.out.println("input is exceeding...please enter a valid input!");
	}

}
	}
