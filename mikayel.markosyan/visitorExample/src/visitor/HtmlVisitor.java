package visitor;

public class HtmlVisitor implements  Visitor {
    private  String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
       output += "<b>" + docPart.getText()+ "</b>";
    }

    @Override
    public void visit(HyperLink docPart) {
       output += "<a href =\""  + docPart.getUrl() + "\">" + docPart.getText() + "</a>";
    }

    public String getOutput() {
        return output;
    }
}
