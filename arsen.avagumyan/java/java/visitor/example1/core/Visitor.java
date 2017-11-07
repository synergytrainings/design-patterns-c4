package java.visitor.example1.core;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public interface Visitor {
    public void visit(SpaceTwoDimensional p);
    public void visit(SpaceThreeDimensional p);
}
