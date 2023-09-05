package timeComplexity;

import java.util.Scanner;

public class UniqueElement {
	public static int findUnique(int[] arr) {
	    //insertion sort arr1  with nlogn TC
	int n= arr.length;

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
	
	// 	//finding unique element with logn TC so total TC is (nlogn+logn )i.e. O(nlogn)
	// 	int unique=0;
	// 	int i;
	// 	for( i=0;i<n-1;i+=2){
	// 		if(arr[i]!=arr[i+1]){
    //             unique=arr[i];
	// 			break;
	// 		}
	// 	}
	// 	if(i==n-1)
	// 	{
	// 		unique=arr[i];
	// 	}
	// 	return unique;


		//Alternative better method with O(n)TC
		int uniquexor=0;
		for(int i=0;i<n;i++){
			uniquexor=uniquexor^arr[i];
		}
		
		return uniquexor;
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
           System.out.println(findUnique(arr));
            
    }    


}
