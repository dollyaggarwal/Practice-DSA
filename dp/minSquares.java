package dp;

import java.util.Arrays;
import java.util.Scanner;

public class minSquares {
	
	public static int minSquares(int n, int dp[]) {
		
		if (n==0)
			return 0;
		int minAns=Integer.MAX_VALUE;
		
		for(int i=1; i*i<=n; i++) {
			int currAns;
			if(dp[n-(i*i)]==-1) {
				currAns=minSquares(n-(i*i), dp);
				dp[n-(i*i)]=currAns;
			}
			else
				currAns=dp[n-(i*i)];
			if(minAns> currAns)
				minAns=currAns;
		}
		return 1+minAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(minSquares(n, dp));

	}

}
