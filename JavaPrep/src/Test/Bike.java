package Test;

public class Bike extends Vehicle {

    public Bike()
    {
        System.out.println("Creating Bike");
    }
    @Override
    public Bike vehicleInfo() {
        System.out.println("Driving a Bike");
        return this;
    }
}
