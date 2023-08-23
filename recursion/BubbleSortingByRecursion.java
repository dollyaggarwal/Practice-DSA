package recursionaAssignment;

import java.util.Arrays;

public class BubbleSortingByRecursion {

	public static void main(String[] args) {
		int arr[]= {4,1,7,4,5,2,0,-3};
		bubble(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void bubble(int arr[],int si,int n) {
		if(n==0)
			return;
		
		if(si<n) {
			
		if(arr[si]>arr[si+1]) {
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
			}
		
			bubble(arr,si+1,n);
		}
		
		else
		{
			bubble(arr,0,n-1);
		}
	}

}
