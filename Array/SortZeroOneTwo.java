package arrays;

import java.util.Scanner;

public class SortZeroOneTwo {
	public static void sort012(int[] arr){
		int n=arr.length;
		int nz=0;
		int nt=n-1;
		int i=0;
		while(i<=nt)  
		{
			if(arr[i]==0)
			{
				int temp = arr[i];
				arr[i]= arr[nz];
				arr[nz]=temp;
				nz++;
			}

			else  if(arr[i]==2)
			{

				int temp = arr[i];
				arr[i]= arr[nt];
				arr[nt]=temp;
				nt--;
				i--;

			}
			i++;
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
		sort012(ar);
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();

	}
}
