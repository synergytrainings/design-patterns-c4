package java.visitor.example1.core;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public abstract class Space {
    public abstract void accept ( Visitor v );
    private double metric;
    private double x;
    public double getX () { return x; }
    public double getMetric () {
        return metric;
    }
    public void setMetric ( double metric ) {
        this.metric = metric;
    }

    public void setX(double x) {
        this.x = x;
    }
}
