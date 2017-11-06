package visitor.visitorPattern;

/**
 * Created by ani.alaverdyan on 11/6/2017.
 */
public interface Element {

    public void accept(Visitor visitor);
}
