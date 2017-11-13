package factory;

import java.util.Set;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public interface ValidatorFactory {

    Validator newInstance(String validatorKey);
}