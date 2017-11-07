/**
 * Created by astghik.aghajanyan on 11/6/2017.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Monitor monitor) {
       monitor.show();
    }

    @Override
    public void visit(Mouse mouse) {
        mouse.click();
    }

    @Override
    public void visit(Keyboard keyboard) {
        keyboard.copy();
    }
}
