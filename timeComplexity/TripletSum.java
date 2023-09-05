package timeComplexity;

import java.util.Scanner;

public class TripletSum {
	public static int tripletSum(int[] arr, int num) {
	int n=arr.length;
		
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

int tricount=0;

for(int i=0;i<n;i++){
	int j=i+1;
	int k=n-1;
	while(j<k){
int sum=arr[i]+arr[j]+arr[k];
if(sum==num){
	if(arr[j]==arr[k]){
		int numCount = (k-j)+1;
		tricount=tricount + ( (numCount) * (numCount-1) / 2);
		break;
	}
	else{
	int	count1=1;
	int	count2=1;
		while(j+1<k && arr[j]==arr[j+1]){
			count1++;
		j++;
		}
		while(k-1>j && arr[k]==arr[k-1]){
			count2++;
			k--;
	}
	tricount=tricount+count1*count2;
	j++;
	k--;
}
}
else if (sum>num)
	k--;

	else
	j++;
}

}
 return tricount;

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
           System.out.println(tripletSum(arr,num));
            
    }   


}
