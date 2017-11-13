package factoryMethod;

/**
 * Created by astghik.aghajanyan on 11/13/2017.
 */
public class ResponseXMLDisplayService extends DisplayService{

    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
