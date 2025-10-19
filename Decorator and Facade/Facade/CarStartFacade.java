package Facade;

// Facade — объединяет сложные действия в один простой метод
public class CarStartFacade {
    private Engine engine;
    private FuelPump fuelPump;
    private AirConditioner airConditioner;
    private Dashboard dashboard;

    public CarStartFacade() {
        this.engine = new Engine();
        this.fuelPump = new FuelPump();
        this.airConditioner = new AirConditioner();
        this.dashboard = new Dashboard();
    }

    public void startCar() {
        System.out.println("=== Starting the car ===");
        fuelPump.pump();
        engine.start();
        airConditioner.turnOn();
        dashboard.showStatus("Car is ready to drive!");
    }

    public void stopCar() {
        System.out.println("=== Stopping the car ===");
        airConditioner.turnOff();
        engine.stop();
        dashboard.showStatus("Car stopped.");
    }
}
