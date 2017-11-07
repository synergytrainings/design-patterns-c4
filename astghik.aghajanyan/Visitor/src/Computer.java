/**
 * Created by astghik.aghajanyan on 11/6/2017.
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts ;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse() , new Monitor() , new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i = 0 ; i< parts.length ; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
