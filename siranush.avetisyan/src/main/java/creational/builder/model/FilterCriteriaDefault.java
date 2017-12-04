package designPatterns.creational.builder.model;

import designPatterns.creational.builder.FilterOperator;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class FilterCriteriaDefault implements FilterCriteria {

    /**
     * The name of the field the filters corresponds to
     */
    private String field;

    /**
     * The type of the filter (e.g. in, range, gte and  etc.)
     */
    private FilterOperator operator;

    /**
     * The values of the filter. The values can vary depending on the type of filter operator.
     * E. g. the in filter values type is array, contains filter value type is string.
     */
    private Object value;

    public FilterCriteriaDefault(String field, FilterOperator operator, Object value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public String toJson() {
        return this.field + " " + this.operator.getSerializedValue() + " " + this.value;
    }
}
