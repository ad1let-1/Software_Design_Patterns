package Decorator;

public class ElectricCar extends VehicleDecorator {
    public ElectricCar(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Electric System Installed");
    }
}
