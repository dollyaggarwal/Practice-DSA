package arrays;
import java.util.Scanner;
public class SortZerosAndOnes {
	public static void sortZeroesAndOne(int[] arr) {
		int n=arr.length;
		int i=0,j=n-1;
		//	        for(int i=0;i<n;i++){
		//	            if(arr[i]==0){
		//	                int temp=arr[j];
		//	                arr[j]=arr[i];
		//	                arr[i]=temp;
		//	                j++;
		//	            }
		//	            }
		
		//alternative approach
		while(i<j) {
			
		if(arr[i]==arr[j]&& arr[j]==1)
			j--;

		else if(arr[i]==arr[j]&& arr[i]==0)
			i++;
		else if(arr[i]==0 && arr[j]==1){
			i++;
			j--;
			}
		else {
			int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j--;
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
			int[] arr=new int[n];
			for (int i =0 ; i<n;i++)
			{
				arr[i]=sr.nextInt();
			}
			sortZeroesAndOne(arr);
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();

			t -= 1;
		}
	}
}
