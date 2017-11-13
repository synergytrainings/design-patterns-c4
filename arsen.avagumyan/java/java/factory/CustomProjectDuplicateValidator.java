package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class CustomProjectDuplicateValidator implements Validator{

    @Override
    public boolean validate(List<?> items, Object... arguments){
        if(arguments != null && arguments.length != 0){
            List inputSet = new ArrayList();
            for (Object field : items) {
                if (ProjectUtil.equalsProject(field,arguments)) return true;
            }
            return items.size() == inputSet.size();
        }
        return false;
    }

    String validateMessage = "validateMessage -> Custom Project Duplicate Validator";
    @Override
    public String validateMessage() {
        return validateMessage;
    }
}
