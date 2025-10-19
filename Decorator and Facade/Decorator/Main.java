package Decorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("🚗 Basic Car:");
        Vehicle basic = new BasicCar();
        basic.assemble();

        System.out.println("\n\n Electric Car:");
        Vehicle electric = new ElectricCar(new BasicCar());
        electric.assemble();

        System.out.println("\n\n AutoPilot Car:");
        Vehicle autopilot = new AutoPilotCar(new ElectricCar(new BasicCar()));
        autopilot.assemble();

        System.out.println("\n\n Turbo AutoPilot Car:");
        Vehicle turboAuto = new TurboCar(new AutoPilotCar(new ElectricCar(new BasicCar())));
        turboAuto.assemble();
    }
}
