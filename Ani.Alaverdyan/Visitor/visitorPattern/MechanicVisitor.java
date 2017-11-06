package visitor.visitorPattern;

/**
 * Created by ani.alaverdyan on 11/6/2017.
 */
public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked Engine.");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Car polished");
    }
}
