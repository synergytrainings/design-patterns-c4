package visitor.visitorPattern;

/**
 * Created by ani.alaverdyan on 11/6/2017.
 */
public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Started the engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knocked on the body");

    }
}
