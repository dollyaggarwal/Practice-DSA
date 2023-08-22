package twoDArrays;

import java.util.Scanner;

public class SpiralPrint {
	 public static void spiralPrint(int matrix[][]) {
		 int n = matrix.length;
	        if (n == 0)
	            return;
	        int m = matrix[0].length;
	        int rs = 0, re = n - 1;
	        int cs = 0, ce = m - 1;
	        int i;
	        int numElements = n * m, count = 0;
	        while (count < numElements) {
	            for (i = cs; count < numElements && i < m; i++) {
	                System.out.print(matrix[rs][i] + " ");
	                count++;
	            }
	            rs++;
	            for (i = rs; count < numElements && i < n; i++) {
	                System.out.print(matrix[i][m - 1] + " ");
	                count++;
	            }
	            m--;
	            for (i = m - 1; count < numElements && i >= cs; i--) {
	                System.out.print(matrix[n - 1][i] + " ");
	                count++;
	            }
	            n--;
	            for (i = n - 1; count < numElements && i >= rs; i--) {
	                System.out.print(matrix[i][cs] + " ");
	                count++;
	            }
	            cs++;
	            
	        }

	    }
	 public static void main(String args[]) {
	        int N, M;
	        Scanner sr = new Scanner(System.in);
	       
	       
	            N = sr.nextInt();
	            M = sr.nextInt();
	            int arr[][] = new int[N][M]; // Swap n and m in array dimensions
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < M; j++) {
	                    arr[i][j] = sr.nextInt();
	                }
	            }
	            spiralPrint(arr);
		    System.out.println();
	        }
	    }



