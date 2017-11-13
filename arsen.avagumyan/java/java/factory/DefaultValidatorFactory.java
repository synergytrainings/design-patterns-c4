package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class DefaultValidatorFactory implements ValidatorFactory{
    private final Map<String, Validator> instances = new HashMap<String, Validator>();
    public DefaultValidatorFactory() {
    }

    @Override
    public Validator newInstance(String validatorKey) {
        if(instances.containsKey(validatorKey)) return instances.get(validatorKey);
        if("required".equals(validatorKey)){
            instances.put("required", new RequiredValidator());
            return instances.get(validatorKey);
        }else if ("duplicate".equals(validatorKey)){
            instances.put("duplicate", new DuplicateValidator());
        }else if("fileNameExtension".equals(validatorKey)){
            instances.put("fileNameExtension", new FileNameExtensionValidator());
        }
        return instances.get(validatorKey);
    }
}
