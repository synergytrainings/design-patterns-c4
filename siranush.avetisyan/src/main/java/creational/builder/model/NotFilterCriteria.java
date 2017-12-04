package designPatterns.creational.builder.model;

import designPatterns.creational.builder.FilterOperator;

/**
 * @author Siranush.Avetisyan
 * @since 12/4/2017
 */
public class NotFilterCriteria implements FilterCriteria {

    private FilterOperator operator;

    private FilterCriteria filterCriteria;

    public NotFilterCriteria(FilterOperator operator, FilterCriteria filterCriteria) {
        this.operator = operator;
        this.filterCriteria = filterCriteria;
    }

    @Override
    public String toJson() {
        return this.operator.getSerializedValue() + "(" + this.filterCriteria.toJson() + ")";
    }
}
