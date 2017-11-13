package factory;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import java.util.List;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public interface Validator {
    boolean validate(List<?> items, Object... arguments);
    String validateMessage();
}
