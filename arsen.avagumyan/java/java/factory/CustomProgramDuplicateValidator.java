package factory;

import java.util.List;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class CustomProgramDuplicateValidator implements Validator {

    @Override
    public boolean validate(List<?> items, Object... arguments) {
        return false;
    }

    String validateMessage = "validateMessage -> Custom Program Duplicate Validator";
    @Override
    public String validateMessage() {
        return validateMessage;
    }
}
