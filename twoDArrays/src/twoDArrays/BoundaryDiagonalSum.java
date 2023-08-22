package twoDArrays;
import java.util.*;
public class BoundaryDiagonalSum {
	public static void totalSum(int[][] mat) {
		int n=mat.length;
//		int bsum=0, d1sum=0, d2sum=0;
//		int tsum=0;
//	if(n==0){
//			System.out.println(tsum);
//			return;
//		}
//	for(int i=0;i<n;i++){
//
//		d2sum=d2sum+mat[i][n-1-i];
//
//		for(int j=0;j<n;j++){
//				if(i==0 || j==0 || i==(n-1) || j==(n-1))
//					bsum=bsum+mat[i][j];
//			
//				if(i==j)
//					d1sum=d1sum+mat[i][j];			
//	}
//	}
//	tsum=bsum+d1sum+d2sum-(mat[0][0]+mat[0][n-1]+mat[n-1][n-1]+mat[n-1][0]);
//
//	if(n%2!=0)
//		tsum=tsum-mat[n/2][n/2];
//
//	System.out.println(tsum);

	//Alternative approach
	int sum=0;
	//top & bottom rows
		for(int i=0;i<n;i++){
			sum=sum+mat[0][i];
			sum=sum+mat[n-1][i];
			}
			//left & right columns
			for(int i=1;i<n-1;i++){
				sum=sum+mat[i][0];
				sum=sum+mat[i][n-1];
			}
			//left & right diagonal
			for(int i=1;i<n-1;i++){
				sum=sum+mat[i][i];
				sum=sum+mat[i][n-1-i];
			}
			//if n is odd
			if(n%2!=0)
				sum=sum-mat[n/2][n/2];
				System.out.println(sum);
	}
	
	 public static void main(String args[]) {
	        int t, N, M;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) {
	            N = sr.nextInt();
	            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < N; j++) {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
	            totalSum(ar);
	        }
	    }
}
