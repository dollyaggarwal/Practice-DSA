package twoDArrays;

public class Basics {
	public static void main (String[] args) {
//	    int arr[][]=new int[4][5];
//	    for(int i=0;i<5;i++)
//	    {
//	        arr[i][0]=2;
//	    }
//	    System.out.print(arr[3][0]);
		
		
		int[][] arr = { {1,2,4,5,7},{3,4,5,6,7},{5,6,7,8,9} }; 
	    System.out.println(arr.length+arr[0].length); 
	    
	    
		 int[][] arr1 = { { 1, 2 }, { 3, 4 } }; 
		    System.out.println(arr1[0][0]+arr1[1][1]); 
		    
		    
		    
	    
	    int arr2[][]=new int[4][5];
		
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<5;j++)
	        arr2[i][j]=i*j;
	    }
	    System.out.println(arr2[3][4]);
	    
	    
	    int[][] arr3 = new int [2][2]; 
	    for (int i = 0; i < 2; i++) { 
	        for (int j = 0; j < 2; j++) { 
	            System.out.print(arr3[i][j] + " "); 
	        } 
	    } 
	}

}
