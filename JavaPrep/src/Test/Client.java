package Test;

public class Client {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.createVehicle("Bike");
        car.vehicleInfo();
    }
}
