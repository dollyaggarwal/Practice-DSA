package interfaces;

public class VehicleUse{

    public static void main(String[] args){
        Vehicle v= new Vehicle();
        VehicleInterface vI;
        v.print();
        vI= new Vehicle();
        vI.getCompany();
        System.out.println(v.getCompany());
        System.out.println(v.isMotorized());
    }
}
