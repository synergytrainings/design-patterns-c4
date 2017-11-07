package java.visitor.example1.core;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class SpaceThreeDimensional extends Space {
    public SpaceThreeDimensional(double x, double y, double z ) {
        super.setX(x);
        this.y = y;
        this.z = z;
    }
    public void accept ( Visitor v ) {
        v.visit( this );
    }

    private double y;
    public double getY () { return y; }

    private double z;
    public double getZ () { return z; }
}
