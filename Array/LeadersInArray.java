package arrays;

import java.util.Scanner;

public class LeadersInArray {
	
	public static void findLeaders(int arr[], int n) {
		  // Initialize the leaders array.
		  boolean leaders[]=new boolean[n];
		  for (int i = 0; i < n; i++) {
		    leaders[i] = false;
		  }

		  // Iterate from the rightmost element.
		  for (int i = n - 1; i >= 0; i--) {
		    // Check if the current element is greater than all the elements to its right.
		    int j;
		    for (j = i + 1; j < n; j++) {
		      if (arr[i] < arr[j]) {
		        break;
		      }
		    }

		    // If the current element is greater than all the elements to its right, then it is a leader.
		    if (j == n) {
		      leaders[i] = true;
		    }
		  }

		  // Print the leaders in reverse order.
		  for (int i = n - 1; i >= 0; i--) {
		    if (leaders[i]) {
		     System.out.print(arr[i] + " "); 
		    }
		  }
		}

		public static void main(String args[]) {
		 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		  int arr[]=new int[n];
		  for (int i = 0; i < n; i++) {
			  arr[i]= s.nextInt();
		  }

		  findLeaders(arr, n);
		  
		}

}
