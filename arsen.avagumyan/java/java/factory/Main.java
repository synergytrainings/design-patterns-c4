package factory;

/**
 * Created by arsen.avagumyan on 11/13/2017.
 */
public class Main {

    public static void main(String[] args){
        ValidatorFactory defaultValidatorFactory = new DefaultValidatorFactory();
        String validateMessage1 = defaultValidatorFactory.newInstance("required").validateMessage();
        String validateMessage2 = defaultValidatorFactory.newInstance("required").validateMessage();
        String validateMessage3 = defaultValidatorFactory.newInstance("required").validateMessage();

        ValidatorFactory customValidatorFactory = new CustomValidatorFactory();
        String validateMessage4 = defaultValidatorFactory.newInstance("required").validateMessage();

        CustomValidatorFactory   customValidatorFactory1= new CustomValidatorFactory("projectDuplicate", new CustomProgramDuplicateValidator());
        String validateMessage5 = defaultValidatorFactory.newInstance("required").validateMessage();
    }
}
