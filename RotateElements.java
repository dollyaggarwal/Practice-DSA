package arrays;
import java.util.*;
public class RotateElements {
	  public static void rotate(int[] arr, int d) {
	        int n=arr.length;
	        // int j;
	        // int temp=Integer.MIN_VALUE;
	        // for(int i=0;i<d;i++){
	            
	        //     for( j=0;j<n-1;j++){
	        //         if(j==0)
	        //          temp=arr[j];

	        //         arr[j]=arr[j+1];
	        //     }
	        //         arr[j]=temp;
	        // }
	        
	        //alternative method

	        // int arr1[]=new int[d];
	      
	        // int j;
	        //  for(int i=0;i<d;i++){
	        //         arr1[i]=arr[i];
	               
	        //     }
	        // for( j=0;j<n-d;j++){
	           
	        //     arr[j]=arr[j+d];
	        // }
	        //  for(int i=0;i<d;i++){
	        //         arr[j]=arr1[i];
	        //         j++;
	        //     }

	            //alternative method by reversing array

	   
	     
	             for(int i=0, j=n-1;i<j;i++){
	                 int temp=arr[i];
	                 arr[i]=arr[j];
	                 arr[j]=temp;
	          
	                 j--;
	                }
	             
	                for(int i=0, j=n-1-d;i<j;i++){
	                     int temp=arr[i];
	                 arr[i]=arr[j];
	                 arr[j]=temp;
	                
	                 j--;
	                }
	             
	             for(int i=n-1-d+1, j=n-1;i<j;i++){
	                 int temp=arr[i];
	                 arr[i]=arr[j];
	                 arr[j]=temp;
	                 
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
