package dp;

import java.util.Arrays;
import java.util.Scanner;

public class countMinStepsToOne {

	public static int MinStepsToOne(int n, int dp[]) {

		if(n==1)
			return 0;
		int ans1;
		if(dp[n-1]==-1) {
			ans1=MinStepsToOne(n-1, dp);
			dp[n-1]=ans1;
		}
		else {
			ans1=dp[n-1];
		}

		int ans2=Integer.MAX_VALUE;
		if(n%2==0) {

			if(dp[n/2]==-1) {

				ans2=MinStepsToOne(n/2, dp);
				dp[n/2]=ans2;
			}
			else
				ans2=dp[n/2];
		}
		int ans3=Integer.MAX_VALUE;
		if(n%3==0) {

			if(dp[n/3]==-1) {
				ans3=MinStepsToOne(n/3, dp);
				dp[n/3]=ans3;
			}
			else
				ans3=dp[n/3];
		}
		dp[n]=Math.min(ans1, Math.min(ans2, ans3))+1;
		return dp[n];
	}


	public static int MinStepsIterative(int n) {

		if (n == 1) {
			return 0;
		}

		int[] minSteps = new int[n + 1];

		minSteps[1] = 0;

		for (int currStep = 2; currStep <= n; currStep++) {

			int subtractOne = Integer.MAX_VALUE;
			int divideByTwo = Integer.MAX_VALUE;
			int divideByThree = Integer.MAX_VALUE;

			subtractOne = minSteps[currStep - 1];

			if (currStep % 2 == 0) {
				divideByTwo = minSteps[currStep / 2];
			}

			if (currStep % 3 == 0) {
				divideByThree = minSteps[currStep / 3];
			}

			minSteps[currStep] = 1 + Math.min(subtractOne, Math.min(divideByTwo, divideByThree));
		}

		return minSteps[n];
	}




	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);

		int n=s.nextInt();
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		//System.out.println(MinStepsIterative(n));

		System.out.print(MinStepsToOne(n, dp));
	}
}