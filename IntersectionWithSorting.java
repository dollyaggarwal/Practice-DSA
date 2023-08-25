package timeComplexity;
import java.util.Scanner;
public class IntersectionWithSorting {
		public static void intersection(int[] arr1, int[] arr2) {
			 //insertion sort arr1  with nlogn TC
	int n= arr1.length;

	  for(int i=1;i<n;i++)
			{
				int j=i-1;
				int temp=arr1[i];
				while(j>=0 && arr1[j]>temp)
				{
					arr1[j+1]=arr1[j];
					j--;
				}
				arr1[j+1]=temp;
			}

	//insertion sort arr2 with mlogm TC
		int m=arr2.length;
		 for(int i=1;i<m;i++)
			{
				int j=i-1;
				int temp=arr2[i];
				while(j>=0 && arr2[j]>temp)
				{
					arr2[j+1]=arr2[j];
					j--;
				}
				arr2[j+1]=temp;
			}
		 //intersection between both arr1 and arr2 with nlogn+mlogm+m+n => (nlogn+mlogm) TC    

			int i=0,j=0;
			while(i<n && j<m){
					if(arr1[i]<arr2[j])
					i++;
				else if(arr1[i]>arr2[j])
						j++;
					else{

					
					System.out.print(arr2[j]+" ");
					i++;
					j++;
					}

				}
				System.out.println();
		 
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
	            intersection(arr1, arr2);
	            System.out .println();
	            t -= 1;
	        }
	    }
	}



