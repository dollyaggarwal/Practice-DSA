package arrays;
import java.util.Scanner;
public class LinearSearch {
	
	 public static int linearSearch(int arr[], int x) {

			int i;
   for( i=0;i<arr.length;i++){

	      if(x==arr[i])
	        return i;
	      }
 return -1;
	    }
	 public static void main(String[] args)  {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        
	        while(t > 0) 
	        {
	            int size = s.nextInt();
	            int[] arr = new int[size];
	            for (int i = 0; i < size; ++i) 
	            {
	                arr[i] = s.nextInt();
	            }
	            
	            int x =s.nextInt();
	            System.out.println(linearSearch(arr,x));
	            t -= 1;
	        }
	    }

}
