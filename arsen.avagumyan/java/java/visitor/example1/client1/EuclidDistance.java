package java.visitor.example1.client1;


import java.visitor.example1.core.SpaceTwoDimensional;
import java.visitor.example1.core.SpaceThreeDimensional;
import java.visitor.example1.core.Visitor;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class EuclidDistance implements Visitor {
    public void visit ( SpaceTwoDimensional p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() ) );
    }
    public void visit ( SpaceThreeDimensional p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() + p.getZ()*p.getZ() ) );
    }
}
