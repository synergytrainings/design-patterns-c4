package factoryMethod;

/**
 * Created by astghik.aghajanyan on 11/13/2017.
 */
public class TestFactoryMethodPattern {
    public static void main(String[] args) {

        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();

    }

}
