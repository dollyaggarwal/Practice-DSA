package arrays;
import java.util.Scanner;
public class MergeArrays {

	public static int[] merge(int arr1[], int arr2[]) {
	    
	    int i=0,j=0,k=0;
	    int n=arr1.length;
	    int m=arr2.length;
	    int s=n+m;
	    int arr3[]=new int[s];
	    while(i<n &&j<m){
	        if(arr1[i]==arr2[j]){
	            arr3[k]=arr1[i];
	            k++;
	            arr3[k]=arr2[j];
	            k++;
	            i++;
	            j++;
	        }
	        else if(arr1[i]<arr2[j]){
	            arr3[k]=arr1[i];
	            i++;
	            k++;

	        }
	        else {
	            arr3[k]=arr2[j];
	            j++;
	            k++;
	        }
	    }
	    while(i<n){
	        
	            arr3[k]=arr1[i];
	            i++;
	            k++;
	        }
	    while(j<m)
	        {
	            arr3[k]=arr2[j];
	            j++;
	            k++;
	        }
	    
	    return arr3;
	    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i] = sc.nextInt();
		    }
		    int m = sc.nextInt();
		    int[] arr2 = new int[m];
		    for(int i=0;i<m;i++)
		    {
		        arr2[i] = sc.nextInt();
		    }
		    int[] ans = new int[m+n];
		    ans =merge(arr1, arr2);
            for(int i=0;i<m+n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();		
		
	}
}
