package inheritance;

public class VehicleUse{

    public static void main(String[] args){

      //  Vehicle v= new Vehicle();
        //v.color= "Red";
      //  v.setColor("red");
     //   v.maxSpeed= 80;
    //    v.print();
    	Vehicle v= new Car(4, 100);//polymorphism
    	
    	//v.maxSpeed();//its an child class method so will give error called compile time polymorphism
    	 v.print();//will call car's print function ,this is runtime polymorphism
    	 v.maxSpeed=10;//vehicle's property
    	// v.numDoors=4;//car's property so error
    	 
    	 
        Car c= new Car(4, 100);
        c.print();

        //c.color= "Black";
        c.setColor("black");
        c.maxSpeed = 100;
        c.numDoors= 4;
        //c.print();
        c.printCar();
    }
}
