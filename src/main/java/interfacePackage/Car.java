package interfacePackage;

public class Car implements Vehicle{

    private int wheels;

    private String vehicleNo;

    private String fuel;

    private int mileage;

    private String color;

    private String model;

    private String company;

    public Car(String vehicleNo, String fuel, int mileage, String color, String model, String company) {
        this.setNoOfWheels(4);
        this.vehicleNo = vehicleNo;
        this.fuel = fuel;
        this.mileage = mileage;
        this.color = color;
        this.model = model;
        this.setCompany(company);
    }

    public int getWheels() {
        return wheels;
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

    @Override
    public void setNoOfWheels(int wheels) {
        this.wheels = wheels;
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
}
