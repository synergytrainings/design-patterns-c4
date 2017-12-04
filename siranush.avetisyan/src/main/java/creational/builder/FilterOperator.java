package designPatterns.creational.builder;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public enum FilterOperator {
    IN("in"),
    RANGE("range"),
    LTE("<="),
    LT("<"),
    GTE(">="),
    GT(">"),
    STARTS("starts"),
    CONTAINS("contains"),
    IS("="),
    AND("&&"),
    OR("||"),
    NOT("!");

    private String serializedValue;

    FilterOperator(String serializedValue) {
        this.serializedValue = serializedValue;
    }

    public String getSerializedValue() {
        return serializedValue;
    }
}
