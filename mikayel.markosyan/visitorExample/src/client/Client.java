package client;

import visitor.*;

public class Client {

    public static void main(String[] args) {

        DocumentPart  plainText = new PlainText();
        plainText.setText("aaaa");

        BoldText boldText  = new BoldText();
        boldText.setText("sadasd");

        HyperLink hyperLink = new HyperLink();
        hyperLink.setText("dfjdsf");
        hyperLink.setUrl("www.google.com");

         Document document = new Document();
         document.getParts().add(plainText);
         document.getParts().add(boldText);
         document.getParts().add(hyperLink);

        HtmlVisitor htmlVisitor = new HtmlVisitor();

         document.accept(htmlVisitor);

         System.out.println(htmlVisitor.getOutput());

         LatexVisitor latexVisitor = new LatexVisitor();

         document.accept(latexVisitor);

         System.out.println(latexVisitor.getOutput());


    }
}
