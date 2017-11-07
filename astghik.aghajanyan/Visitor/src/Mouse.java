/**
 * Created by astghik.aghajanyan on 11/6/2017.
 */
public class Mouse implements ComputerPart {

    public void  click(){
        System.out.println("To do something");
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
