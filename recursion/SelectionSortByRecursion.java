package recursionaAssignment;

import java.util.Arrays;

public class SelectionSortByRecursion {

	public static void main(String[] args) {
		int arr[]= {4,1,7,4,5,2,0,9};
		selectionsort(arr,0,arr.length,0);
		System.out.println(Arrays.toString(arr));

	}
	public static void selectionsort(int arr[],int si,int n,int maxIndex) {
		if(n==0)
			return;
		
		if(si<n) {
			
		if(arr[si]>arr[maxIndex]) 	
		
			selectionsort(arr,si+1,n,si);
		else
			selectionsort(arr,si+1,n,maxIndex);
		}
		else
		{
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[n-1];
			arr[n-1]=temp;
			selectionsort(arr,0,n-1,0);
		}
	}

}
