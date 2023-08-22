package twoDArrays;

public class JaggedArrays {
	 public static void main(String args[]) {
		 
//	      int[][]arr=new int[3][5];
//	      
//	      System.out.println(arr[0][0]);
		 
//		  int arr1[][]=new int [4][];
//		    System.out.print(arr1[2].length);//will throw nullpointerexception
	      
	      int[][]arr=new int[4][];
	      
	      System.out.println(arr);
	      
	      for(int i=0;i<arr.length;i++){
	    	  
	          System.out.println(arr[i]);
	      }
	     // System.out.println(arr[0][0]);//will throw NullPointerException
	      
	      for(int i=0;i<arr.length;i++){
	    	  
	          arr[i]=new int[5];
	      }
	      for(int i=0;i<arr.length;i++){
	    	  
	          arr[i]=new int[i+1];
	      }
	      for(int i=0;i<arr.length;i++){
	    	  
	          for(int j=0;j<arr[i].length;j++){
	        	  
	              System.out.print(arr[i][j]+" ");
	          }
	          System.out.println();
	      }
	      
	}
}
