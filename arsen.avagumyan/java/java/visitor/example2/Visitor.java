package java.visitor.example2;
/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public interface Visitor {
    public void visit(City city);
    public void visit(Park park);
    public void visit(Coffee coffee);
    public void visit(Hotel hotel);
}
