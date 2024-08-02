package Test;

public class Car extends Vehicle{

    public Car()
    {
        System.out.println("Creating Car");
    }
    @Override
    public Car vehicleInfo() {
        System.out.println("Driving a car");
        return this;

    }


}
