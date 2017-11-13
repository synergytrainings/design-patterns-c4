package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class RequiredValidator implements Validator {
    private final Map map;
    String validateMessage = "validateMessage -> Required";;

    public RequiredValidator() {
        this.map = new HashMap();
    }

    public void setProperty(String var1, Object var2) {
        map.put(var1,var2);
    }

    public Object getProperty(String var1) {
        return map.get(var1);
    }

    @Override
    public boolean validate(List<?> items, Object... arguments) {
        if(arguments != null && arguments.length != 0){
            List inputSet = new ArrayList();
            for (Object field : arguments) {
                if (field != null) inputSet.add(field);
            }
            return items.size() == inputSet.size();
        }
        return false;
    }

    @Override
    public String validateMessage() {
        return validateMessage;
    }
}
