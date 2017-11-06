package visitor.visitorPattern;

/**
 * Created by ani.alaverdyan on 11/6/2017.
 */
public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();

        Visitor hooligan = new HooliganVisitor();
        Visitor mechanic = new MechanicVisitor();

        System.out.println("Start hooligan");
        body.accept(hooligan);
        engine.accept(hooligan);

        System.out.println("\n -----------------------------------\n");

        System.out.println("Start mechanic");
        body.accept(mechanic);
        engine.accept(mechanic);

    }
}
