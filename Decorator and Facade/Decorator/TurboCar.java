package Decorator;

public class TurboCar extends VehicleDecorator {
    public TurboCar(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Turbo Boost Activated");
    }
}
