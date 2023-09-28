package arrays;

import java.util.Scanner;

public class PushZerosAtEnd {
	
	 public static void pushZerosAtEnd(int[] arr) {
   	  int n=arr.length;
         
        // int i=0,j=0;
       // while(i<n&& j<n){
       //     if (arr[i]>0 && arr[j]>0){
       //         i++;
       //         j++;
       //     }
       //     else if(arr[i]==0 && arr[j]==0){
       //         i++;
       //     }
       //     else {
       //         int temp=arr[i];
       //         arr[i]=arr[j];
       //         arr[j]=temp;
       //         i++;
       //         j++;
       //     }

       // }

       //Alternative method
       int j=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }
       }
   }
	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			    int n = sc.nextInt();
			    int[] arr = new int[n];
			    for(int i=0;i<n;i++)
			    {
			        arr[i] = sc.nextInt();
			    }
			  
			    pushZerosAtEnd(arr);
	            for(int i=0;i<n;i++)
	            {
	                System.out.print(arr[i]+" ");
	            }
	            System.out.println();		
			
		}

}
