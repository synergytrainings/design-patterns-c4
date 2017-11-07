package java.visitor.example1.core;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class SpaceTwoDimensional extends Space {
    public SpaceTwoDimensional(double x, double y ) {
        super.setX(x);
        this.y = y;
    }

    public void accept ( Visitor v ) {
        v.visit( this );
    }

    private double y;
    public double getY () { return y; }
}
