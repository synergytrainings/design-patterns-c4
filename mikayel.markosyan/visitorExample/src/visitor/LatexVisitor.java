package visitor;

public class LatexVisitor implements Visitor {
    private  String  output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
       output += "\\textbf{"+docPart.getText()+ "}";
    }

    @Override
    public void visit(HyperLink docPart) {
       output += "\\href{" + docPart.getUrl() +"}{" +docPart.getText() +"}";
    }

    public  String getOutput() {
        return  output;
    }
}
