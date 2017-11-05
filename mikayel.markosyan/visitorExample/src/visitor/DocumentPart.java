package visitor;

public abstract class DocumentPart {
    private  String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public  abstract  void accept(Visitor visitor);
}
