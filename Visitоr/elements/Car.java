package visitor.elements;

import visitor.visitors.CarElementVisitor;

public class Car implements CarElement {
    private final CarElement[] elements;

    public Car() {
        elements = new CarElement[] {
                new Wheel("front left"),
                new Wheel("front right"),
                new Wheel("back left"),
                new Wheel("back right"),
                new Body(),
                new Engine()
        };
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
    }
}
