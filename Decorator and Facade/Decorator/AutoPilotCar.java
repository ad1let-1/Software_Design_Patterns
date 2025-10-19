package Decorator;

public class AutoPilotCar extends VehicleDecorator {
    public AutoPilotCar(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + AutoPilot Enabled");
    }
}
