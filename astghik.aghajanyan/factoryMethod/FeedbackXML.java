package factoryMethod;

/**
 * Created by astghik.aghajanyan on 11/13/2017.
 */
public class FeedbackXML implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }
}
