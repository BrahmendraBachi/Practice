package interfacePackage;

public class Bike implements Vehicle{


    private int wheels;
    private String vehicleNo;

    private String fuel;

    private int mileage;

    private String color;

    private String model;

    private String company;

    public Bike(String vehicleNo, String fuel, int mileage, String color, String model, String company){
        this.vehicleNo = vehicleNo;
        this.company = company;
        this.model = model;
        this.fuel = fuel;
        this.mileage = mileage;
        this.color = color;
        this.setNoOfWheels(2);
    }

    public Bike(){
        super();
    }

    @Override
    public void setNoOfWheels(int wheels){
        this.wheels = 2;
    }

    @Override
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @Override
    public void setFuelType(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setModelName(String model) {
        this.model = model;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }


    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getFuel() {
        return fuel;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public int getWheels(){
        return this.wheels;
    }
}
