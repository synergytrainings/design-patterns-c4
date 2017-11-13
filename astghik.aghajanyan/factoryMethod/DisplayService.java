package factoryMethod;

/**
 * Created by astghik.aghajanyan on 11/13/2017.
 */
public abstract class DisplayService {

    public void display(){
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
