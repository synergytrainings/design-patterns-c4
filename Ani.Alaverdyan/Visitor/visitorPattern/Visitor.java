package visitor.visitorPattern;

/**
 * Created by ani.alaverdyan on 11/6/2017.
 */
public interface Visitor {

    public void visit(EngineElement engine);
    public void visit(BodyElement body);

}
