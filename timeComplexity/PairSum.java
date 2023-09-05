package timeComplexity;

import java.util.Scanner;

public class PairSum {
	public static int pairSum(int[] arr, int num) {
		   int n=arr.length;
		   int pairsum=0; 
		 //insertion sort arr1  with nlogn TC

	for(int i=1;i<n;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
     
     	
	int i=0;
		int j=n-1;
		
		while (i < j) {
         if (arr[i] + arr[j] == num) {
             int leftCount = 1;
             int rightCount = 1;

             // Count the occurrences of arr[i] from the left side
             while (i + 1 < j && arr[i] == arr[i + 1]) {
                 leftCount++;
                 i++;
             }

             // Count the occurrences of arr[j] from the right side
             while (j - 1 > i && arr[j] == arr[j - 1]) {
                 rightCount++;
                 j--;
             }

             if (arr[i] == arr[j]) {
                 // Both numbers are the same, calculate pairs using combination formula
                 int totalCount = leftCount + rightCount;
                 pairsum += (totalCount * (totalCount - 1) / 2);
             }
              else {
                 // Different numbers, multiply the counts
                 pairsum += (leftCount * rightCount);
             }

             i++;
             j--;
         } 
         else if (arr[i] + arr[j] < num) {
             i++;
         } else {
             j--;
         }
     }

     return pairsum;
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
            int num=sr.nextInt();
           System.out.println(pairSum(arr,num));
            
    }   

}
