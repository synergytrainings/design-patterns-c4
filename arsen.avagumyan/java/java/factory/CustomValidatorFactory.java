package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class CustomValidatorFactory implements ValidatorFactory {
    private final Map<String, Validator> instances = new HashMap<String, Validator>();

    public CustomValidatorFactory(String s, Validator validator) {
            instances.put(s, validator);
    }

    public CustomValidatorFactory() {
    }

    @Override
    public Validator newInstance(String validatorKey) {
        if(instances.containsKey(validatorKey)) return instances.get(validatorKey);
        if("projectDuplicate".equals(validatorKey)){
            instances.put("projectDuplicate", new CustomProjectDuplicateValidator());
            return instances.get(validatorKey);
        }
        return instances.get(validatorKey);
    }

}
