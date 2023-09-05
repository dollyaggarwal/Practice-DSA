package interfaces;

public class Vehicle implements VehicleInterface{

    @Override
    public boolean isMotorized(){
      return false;
    }

    @Override
    public String getCompany(){
      return null;
    }

    void print(){
      System.out.println(PI);
    }

}

