package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class DuplicateValidator implements Validator {

    private final Map map;

    public DuplicateValidator(){
        map = new HashMap();
    }
    @Override
    public boolean validate(List<?> items, Object... arguments) {
        if(arguments != null && arguments.length != 0){
            List inputSet = new ArrayList();
            for (Object field : arguments) {
                if (field == null) return true;
            }
            return items.size() == inputSet.size();
        }
        return false;
    }

    String validateMessage = "validateMessage -> Duplicate";
    @Override
    public String validateMessage() {
        return validateMessage;
    }
}
