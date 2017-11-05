package visitor;

public interface Visitor {
    void visit(PlainText docPart);
    void visit(BoldText docPart);
    void visit(HyperLink docPart);
}
