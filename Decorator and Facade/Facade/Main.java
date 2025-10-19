package Facade;

public class Main {
    public static void main(String[] args) {
        CarStartFacade carFacade = new CarStartFacade();

        carFacade.startCar();
        System.out.println();
        carFacade.stopCar();
    }
}
