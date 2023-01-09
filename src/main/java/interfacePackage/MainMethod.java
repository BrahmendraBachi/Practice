package interfacePackage;

public class MainMethod {

    public static void main(String[] args) {

        //HondaBike Extends Bike class
        //Bike object has an access in cast to HondaBike Class
        Bike bike = new HondaBike("VN101", "Petrol", 70, "Black", "Spender");

        //prints car company
        System.out.println(bike.getCompany());


        System.out.println(bike.getWheels());

        Car car = new ToyotaCar("VN102", "Diesel", 20, "Red", "Blender+");

        System.out.println(car.getCompany());
        System.out.println(car.getWheels());

    }

}
