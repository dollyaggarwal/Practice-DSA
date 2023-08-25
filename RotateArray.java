package timeComplexity;
import java.util.*;
public class RotateArray {
	  public static void rotate(int[] arr, int d) {
	    	
	        int n=arr.length;
	        int i=0;
	        int j=d-1;
	        //reversing d array elements
	        while(i<j){
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            i++;
	            j--;
	        }
	        //reversing remaining(n-d) array elements
	         i=d;
	         j=n-1;
	         while(i<j){
	              int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            i++;
	            j--;
	         }
	         //reversing whole array
	         i=0;
	         j=n-1;
	         while(i<j){
	         int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            i++;
	            j--;
	         }
	    }
	  public static void main(String[] args) 
		{
		    Scanner sr = new Scanner(System.in);
		   
		   
	    	    int n=sr.nextInt();
	    	    int ar[] = new int[n];
	    	    for(int i=0;i<n;i++)
	    	    {
	    	        ar[i]= sr.nextInt();
	    	    }
	    	    int d = sr.nextInt();
	    	    rotate(ar,d);
	    	    for(int i=0;i<n ;i++)
	    	    {
	    	        System.out.print(ar[i]+" ");
	    	    }
	    	    System.out.println();
	    	   
		}
}
