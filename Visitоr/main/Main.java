package visitor.main;

import visitor.elements.Car;
import visitor.visitors.PriceVisitor;
import visitor.visitors.RepairVisitor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("=== Repair Process ===");
        car.accept(new RepairVisitor());

        System.out.println("\n=== Price Calculation ===");
        PriceVisitor priceVisitor = new PriceVisitor();
        car.accept(priceVisitor);
        System.out.println("Total price: $" + priceVisitor.getTotalPrice());
    }
}
