package interfacePackage;

public class HondaBike extends Bike{



    //HondaBike i a class extends Bike class and should have a constructor
    // which refers to parent class Bike

    //argConstructor
    public HondaBike(String vehicleNo, String fuel, int mileage, String color, String model) {
        super(vehicleNo, fuel, mileage, color, model, "HondaBike");
    }

    //NoArgConstructor
    public HondaBike(){
        super();
    }
}
