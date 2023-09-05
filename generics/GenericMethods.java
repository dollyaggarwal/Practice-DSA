package generics;

public class GenericMethods {

	    public static<T> void printArray(T arr[])//Generic method to print array of different types
	    {
	        for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i]);
	        }
	    }
	    
	    public static<T extends Vehicle> void printVehicle(T arr[])//Generic method to print array of Vehicle class
	    {
	        for(int i=0;i<arr.length;i++){
	           arr[i].print();
	        }
	    }

	    public static void main(String[] args)
	    {
	    	
	      Integer arr[]= new Integer[5]; //Integer  Array
	      for(int i=0;i<arr.length;i++){
	        arr[i]=i+1;
	      }
	      printArray(arr);

	      String arrS[]= new String[5]; //String Array
	      for(int i=0;i<arrS.length;i++){
	        arrS[i]="abc";
	      }

	      printArray(arrS);
	      
	     Vehicle v[]= new Vehicle[5]; //Object Array
	      for(int i=0;i<v.length;i++){
	       v[i]=new Vehicle(10*i,"bmw");
	      }
	      printVehicle(v);
	    }
	}

