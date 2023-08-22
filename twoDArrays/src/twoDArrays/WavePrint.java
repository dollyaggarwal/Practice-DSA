package twoDArrays;
import java.util.*;
public class WavePrint {
	public static void wavePrint(int mat[][]){
		int n=mat.length;
		if(n==0)
		return;
		
		int m=mat[0].length;

	// 	int j=0;
	// 	while(j<m){
	// 		for(int i=0;i<n;i++){
	// 			System.out.print(mat[i][j]+" ");
	// 		}
	// 		j++;
	// 		if(j==m)
	// 		continue;
	// 		for( int i=n-1;i>=0;i--)
	// 		{
	// 			System.out.print(mat[i][j]+ " ");
	// 		}
	// 		j++;
	// 	}
	// 	System.out.println();
	// }

				//Alternate Approach

		int j=0;
		while(j<m){
			if(j%2==0){
			for(int i=0;i<n;i++){
				System.out.print(mat[i][j]+" ");
			}
			}
		else{
			for( int i=n-1;i>=0;i--)
			{
				System.out.print(mat[i][j]+ " ");
			}
		}
			j++;
		}
		System.out.println();
	}	
	 public static void main(String args[]) {
	        int t, N, M;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) {
	            N = sr.nextInt();
	            M = sr.nextInt();
	            int arr[][] = new int[N][M]; // Swap n and m in array dimensions
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < M; j++) {
	                    arr[i][j] = sr.nextInt();
	                }
	            }
	            wavePrint(arr);
		    System.out.println();
	        }
	    }

}
