/**
 * Created by astghik.aghajanyan on 11/6/2017.
 */
public class Monitor implements ComputerPart {

    public void  show(){
        System.out.println("Show result");
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
