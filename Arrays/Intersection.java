package arrays;
import java.util.*;
public class Intersection {
	 public static void intersections(int arr1[], int arr2[]) {
		    
//	     int n=arr1.length;
//	     int m=arr2.length;
//	    
//	    for(int i=0;i<n;i++){
//
//	      for(int j=0;j<m;j++){
//	        
//	        if(arr1[i]==arr2[j])
//	        {
//	        	 System.out.print(arr2[j]+" ");
//	          arr2[j]=Integer.MIN_VALUE;//to store infinity value in arr2 so that same number again can not match with other element of arr1
//	            break;
//	        }
//	      
//	      }
//	     
//	    }
			int k=1;
			int n=arr1.length;
			int m=arr2.length;
			int intersecarr[]=new int[k];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(arr1[i]==arr2[j]){
						
						intersecarr[k]=arr2[j];
						k=k+1;
						arr2[j]=Integer.MIN_VALUE;
						break;
					}
				}
			}
	    }
	 
	  public static void main(String[] args) 
	    {
	        Scanner sr = new Scanner(System.in);
	        int t = sr.nextInt();
	        while(t > 0) 
	        {
	            int n=sr.nextInt();
	            int[] arr1=new int[n];
	            for (int i =0 ; i<n;i++)
	            {
	                arr1[i]=sr.nextInt();
	            }
	            int m =sr.nextInt();
	            int[] arr2=new int[m];
	            for (int i =0 ; i<m;i++)
	            {
	                arr2[i]=sr.nextInt();
	            }
	            intersections(arr1, arr2);
	            System.out .println();
	            t -= 1;
	        }
	    }

}
