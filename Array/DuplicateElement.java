package timeComplexity;

import java.util.Scanner;

public class DuplicateElement {
	public static int findDuplicate(int[] arr) {
		int n= arr.length;
		 //insertion sort arr1  with nlogn TC

	  	// for(int i=1;i<n;i++)
		// 	{
		// 		int j=i-1;
		// 		int temp=arr[i];
		// 		while(j>=0 && arr[j]>temp)
		// 		{
		// 			arr[j+1]=arr[j];
		// 			j--;
		// 		}
		// 		arr[j+1]=temp;
		// 	}	

		// 	//finding duplicates with O(n)TC so overall TC is n+nlogn i.e., O(nlogn)
		// 		int duplicates=0;
		// 	for(int i=0;i<n-1;i++){
		// 		if(arr[i]==arr[i+1])
		// 			duplicates= arr[i];			
		// 	}
		// 	return duplicates;

			//Alternative better method with O(n)TC
			int duplicates=0;
			int totalsum=0;
			for(int i=0;i<n;i++){
				totalsum=totalsum+arr[i];
			}
			int nsum=((n-2)*(n-1))/2;//finding sum of n-2 natural nos.
		 return	duplicates=totalsum-nsum;
		
		}
	public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
           System.out.println(findDuplicate(arr));
            
    }    

}
