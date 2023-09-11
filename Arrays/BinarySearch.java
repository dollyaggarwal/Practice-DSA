package arrays;
import java.util.Scanner;
public class BinarySearch {
	 public static int binarysearch(int []nums, int target) {
	       int n=nums.length;
	     int start=0,end=n-1;
	     while(start<=end){
	         int mid=(start+end)/2;
	         if(nums[mid]==target)
	         return mid;
	         else if(nums[mid]<target)
	         start=mid+1;
	         else
	         end=mid-1;
	     }
	     return -1;
	    }
	 
	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }

	        int x = s.nextInt();
	        int result = binarysearch(arr, x);
	        System.out.print(result);
	    }

}
