package visitor;

public class PlainText extends  DocumentPart {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
