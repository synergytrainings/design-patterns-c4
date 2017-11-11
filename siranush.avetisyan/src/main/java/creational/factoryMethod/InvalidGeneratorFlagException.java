package designPatterns.creational.factoryMethod;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
public class InvalidGeneratorFlagException extends RuntimeException {

    /**
     * he serialVersionUID unique id for this class
     */
    private static final long serialVersionUID = -4798702738524149479L;

    private String message;

    /**
     * initialize message by given parameter
     *
     * @param message - String
     */
    public InvalidGeneratorFlagException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message != null ? super.getMessage() : this.message + " " + super.getMessage();
    }
}
