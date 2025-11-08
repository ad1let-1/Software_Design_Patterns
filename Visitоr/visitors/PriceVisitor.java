package visitor.visitors;

import visitor.elements.Body;
import visitor.elements.Engine;
import visitor.elements.Wheel;

public class PriceVisitor implements CarElementVisitor {
    private int totalPrice = 0;

    @Override
    public void visit(Engine engine) {
        totalPrice += 3000;
    }

    @Override
    public void visit(Wheel wheel) {
        totalPrice += 500;
    }

    @Override
    public void visit(Body body) {
        totalPrice += 2000;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
