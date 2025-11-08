package visitor.visitors;

import visitor.elements.Body;
import visitor.elements.Engine;
import visitor.elements.Wheel;

public class RepairVisitor implements CarElementVisitor {

    @Override
    public void visit(Engine engine) {
        System.out.println("Repairing engine...");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Repairing " + wheel.getName() + " wheel...");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Repairing car body...");
    }
}
