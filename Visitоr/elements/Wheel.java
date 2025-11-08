package visitor.elements;

import visitor.visitors.CarElementVisitor;

public class Wheel implements CarElement {
    private final String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
