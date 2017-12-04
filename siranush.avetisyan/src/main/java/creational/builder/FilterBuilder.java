package designPatterns.creational.builder;

import designPatterns.creational.builder.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class FilterBuilder {

    private CombinedFilterCriteria filterCriteria;

    public FilterBuilder() {
        this.filterCriteria = new CombinedFilterCriteria(FilterOperator.AND, new ArrayList<>());
    }

    public FilterBuilder and(FilterCriteria filterCriteria) {
        if (this.filterCriteria == null) {
            throw new Error("And operator cannot be called on one filterCriteria. It should be chained.");
        }
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder or(FilterCriteria filterCriteria) {
        if (this.filterCriteria == null) {
            throw new Error("Or operator cannot be called on one filterCriteria. It should be chained.");
        }
        FilterCriteria orFilterCriteria = new CombinedFilterCriteria(FilterOperator.OR, Arrays.asList(this.filterCriteria, filterCriteria));
        this.filterCriteria = new CombinedFilterCriteria(FilterOperator.AND, Arrays.asList(orFilterCriteria));
        return this;
    }

    public FilterBuilder not(FilterCriteria filterCriteria) {
        FilterCriteria notFilterCriteria = new NotFilterCriteria(FilterOperator.NOT, filterCriteria);
        this.filterCriteria.addFilterCriteria(notFilterCriteria);
        return this;
    }

    public FilterBuilder in(String key, List<Integer> value) {
        if (value.size() == 0) {
            throw new Error("In filter requires at least one value.");
        }

        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.IN, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder range(String key, Integer startValue, Integer endValue) {
        if (startValue == null || endValue == null) {
            throw new Error("Range filter Requires 2 values for min and max values.");
        }
        if (startValue > endValue) {
            throw new Error("Start Value cannot be greater than end value in range filter.");
        }

        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.RANGE, Arrays.asList(startValue, endValue));
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder lte(String key, Integer value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.LTE, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder lt(String key, Integer value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.LT, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder gte(String key, Integer value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.GTE, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder gt(String key, Integer value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.GT, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder starts(String key, String value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.STARTS, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder contains(String key, String value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.CONTAINS, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterBuilder is(String key, Integer value) {
        FilterCriteria filterCriteria = new FilterCriteriaDefault(key, FilterOperator.IS, value);
        this.filterCriteria.addFilterCriteria(filterCriteria);
        return this;
    }

    public FilterCriteria build() {
        return this.filterCriteria;
    }

    public String buildToJson() {
        return this.filterCriteria.toJson();
    }

}
