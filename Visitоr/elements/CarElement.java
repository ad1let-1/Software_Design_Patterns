package visitor.elements;

import visitor.visitors.CarElementVisitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
