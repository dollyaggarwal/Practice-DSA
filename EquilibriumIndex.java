package timeComplexity;
import java.util.Scanner;
	public class EquilibriumIndex {
		public static int arrayEquilibriumIndex(int[] arr){  
		    int n=arr.length;
			
			int tsum=0;
			for(int i=0;i<n;i++){
		tsum=tsum+arr[i];

			}
			int i=0;
			int lsum=0;
			int rsum=0;
			while(i<n){
				rsum=tsum-lsum-arr[i];
				  if(lsum==rsum)
				  return i;
				  lsum=lsum+arr[i];
		          i++;

			}
			return -1;

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
	           System.out.println(arrayEquilibriumIndex(arr));
	            
	    }    
	    }

