public class Main {
    public static void main(String[] args) {
        Car bmw = new Bmw();
        Car mercedes = new Mercedes();

        System.out.print(bmw.name() + " -> ");
        bmw.performDrive();

        System.out.print(mercedes.name() + " -> ");
        mercedes.performDrive();

        // Changing driving behavior at runtime — Strategy Pattern in action
        mercedes.setStrategy(new SportDrive());
        System.out.print(mercedes.name() + " (changed strategy) -> ");
        mercedes.performDrive();

        bmw.setStrategy(new OffroadDrive());
        System.out.print(bmw.name() + " (changed strategy) -> ");
        bmw.performDrive();
    }
}
