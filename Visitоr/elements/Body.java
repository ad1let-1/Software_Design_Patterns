package visitor.elements;

import visitor.visitors.CarElementVisitor;

public class Body implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
