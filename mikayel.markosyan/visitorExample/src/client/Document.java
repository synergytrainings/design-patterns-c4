package client;

import visitor.DocumentPart;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentPart> parts = new ArrayList<>();

    public  void  accept(Visitor visitor) {
        for(DocumentPart documentPart : parts) {
            documentPart.accept(visitor);
        }
    }

    public List<DocumentPart> getParts() {
        return parts;
    }
}
