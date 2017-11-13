package factoryMethod;

/**
 * Created by astghik.aghajanyan on 11/13/2017.
 */
public class ResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }
}
