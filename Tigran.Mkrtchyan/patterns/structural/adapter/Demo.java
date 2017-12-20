import model.FactoryB;
import model.MaterialAdaptor;
import model.MaterialForAFactory;
import model.MaterialForBFactory;
import service.FactoryForFactoryInstance;

import java.util.Arrays;

/**
 * @author Tigran.Mkrtchyan
 * @since 12/20/2017.
 */
public class Demo {
    public static void main(String[] args) {
        FactoryB factoryB = FactoryForFactoryInstance.getInstance();
    factoryB.start(Arrays.asList(new MaterialAdaptor(new MaterialForAFactory()), new MaterialForBFactory()));
    }
}
