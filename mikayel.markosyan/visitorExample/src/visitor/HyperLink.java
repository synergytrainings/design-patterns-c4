package visitor;

public class HyperLink extends  DocumentPart {
    private String url;

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
