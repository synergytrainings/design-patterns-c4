package visitor;

public class BoldText extends  DocumentPart {

    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }
}
