package arrays;

public class MaximiseTheSum {

	public static  int maxPathSum(int ar1[], int ar2[], int m, int n) {
		int maxsum = 0, sum1 = 0, sum2 = 0;
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (ar1[i] < ar2[j])
				sum1 += ar1[i++];
			else if (ar1[i] > ar2[j])
				sum2 += ar2[j++];
			else {
				if(sum1>sum2)
					maxsum=maxsum+sum1+ar1[i];
				else
					maxsum=maxsum+sum2+ar2[j];
				sum1=0;
				sum2=0;
				i++;
				j++;
			}
		}
		while (i < m) {
			sum1 += ar1[i];
			i++;
		}
		while (j < n) {
			sum2 += ar2[j];
			j++;
		}
		if(sum1>sum2)
			maxsum=maxsum+sum1;
		else
			maxsum=maxsum+sum2;
		return maxsum;

	}

	//Alternate method

	//	    public static int max(int x, int y) { return (x > y) ? x : y; }
	//	  
	//	    // This function returns the sum of elements on maximum
	//	    // path from beginning to end
	//	  public static  int maxPathSum(int ar1[], int ar2[], int m, int n)
	//	    {
	//	        // initialize indexes for ar1[] and ar2[]
	//	        int i = 0, j = 0;
	//	  
	//	        // Initialize result and current sum through ar1[]
	//	        // and ar2[].
	//	        int result = 0, sum1 = 0, sum2 = 0;
	//	  
	//	        // Below 3 loops are similar to merge in merge sort
	//	        while (i < m && j < n) {
	//	            // Add elements of ar1[] to sum1
	//	            if (ar1[i] < ar2[j])
	//	                sum1 += ar1[i++];
	//	  
	//	            // Add elements of ar2[] to sum2
	//	            else if (ar1[i] > ar2[j])
	//	                sum2 += ar2[j++];
	//	  
	//	            // we reached a common point
	//	            else {
	//	               
	//	               
	//	                // Also add the common element of array,
	//	                // once
	//	                result += max(sum1, sum2) + ar1[i];
	//	  
	//	                // Update sum1 and sum2 for elements after
	//	                // this intersection point
	//	                sum1 = 0;
	//	                sum2 = 0;
	//	  
	//	                // update i and j to move to next element of
	//	                // each array
	//	                i++;
	//	                j++;
	//	            }
	//	        }
	//	  
	//	        // Add remaining elements of ar1[]
	//	        while (i < m)
	//	            sum1 += ar1[i++];
	//	  
	//	        // Add remaining elements of ar2[]
	//	        while (j < n)
	//	            sum2 += ar2[j++];
	//	  
	//	        // Add maximum of two sums of remaining elements
	//	        result += max(sum1, sum2);

	//  return result;
	//  }


	public static void main(String[] args)
	{
		//MaximumSumPath sumpath = new MaximumSumPath();
		int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 };
		int m = ar1.length;
		int n = ar2.length;


		int sumpath= maxPathSum(ar1, ar2, m, n);
		System.out.println(
				"Maximum sum path is :"+sumpath );
	}
}
