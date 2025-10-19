package Decorator;

// Абстрактный декоратор
public abstract class VehicleDecorator implements Vehicle {
    protected Vehicle vehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void assemble() {
        vehicle.assemble(); // делегируем базовой машине
    }
}
