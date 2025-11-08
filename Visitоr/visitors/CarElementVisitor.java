package visitor.visitors;

import visitor.elements.Body;
import visitor.elements.Engine;
import visitor.elements.Wheel;

public interface CarElementVisitor {
    void visit(Engine engine);
    void visit(Wheel wheel);
    void visit(Body body);
}
