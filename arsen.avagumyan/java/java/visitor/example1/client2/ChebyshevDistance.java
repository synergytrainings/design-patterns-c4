package java.visitor.example1.client2;


import java.visitor.example1.core.SpaceTwoDimensional;
import java.visitor.example1.core.SpaceThreeDimensional;

import java.visitor.example1.core.Visitor;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class ChebyshevDistance implements Visitor {
    public void visit ( SpaceTwoDimensional p ) {
        double ax = Math.abs( p.getX() );
        double ay = Math.abs( p.getY() );
        p.setMetric( ax>ay ? ax : ay );
    }
    public void visit ( SpaceThreeDimensional p ) {
        double ax = Math.abs( p.getX() );
        double ay = Math.abs( p.getY() );
        double az = Math.abs( p.getZ() );
        double max = ax>ay ? ax : ay;
        if ( max<az ) max = az;
        p.setMetric( max );
    }
}
