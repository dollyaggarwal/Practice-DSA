package generics;

public class Vehicle {
	
	 int maxSpeed;
	 String company;
	    public Vehicle(int maxSpeed, String company){
	
	        this.maxSpeed = maxSpeed;
	        this.company=company;
	    }


	    public void print(){
	        System.out.println(" Vehicle "+" maxSpeed " + maxSpeed + " company " + company);
	    }
		}



