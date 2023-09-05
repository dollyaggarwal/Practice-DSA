package inheritance;

public class Vehicle {

	private String color;
    protected int maxSpeed;
    public Vehicle() {
    	System.out.println("Vehicle's Implicit Constructor");
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's Explicit Constructor");
        this.maxSpeed = maxSpeed;
    }

    public String getColor(){
      return color;
    }

    public void setColor(String color){
      this.color = color;
    }

    public void print(){
        System.out.println("Vehicle "+ " color "+ color+" maxSpeed "+ maxSpeed);
    }
	}



