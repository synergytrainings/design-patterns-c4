package designPatterns.creational.builder.model;

import designPatterns.creational.builder.FilterOperator;

import java.util.List;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class CombinedFilterCriteria implements FilterCriteria {

    private FilterOperator operator;

    private List<FilterCriteria> filterCriteriaList;

    public CombinedFilterCriteria(FilterOperator operator, List<FilterCriteria> filterCriteriaList) {
        this.operator = operator;
        this.filterCriteriaList = filterCriteriaList;
    }

    public void addFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteriaList.add(filterCriteria);
    }

    @Override
    public String toJson() {
        if (this.filterCriteriaList.size() == 0) {
            return "";
        } else if (this.filterCriteriaList.size() == 1) {
            return this.filterCriteriaList.get(0).toJson();
        } else {
            StringBuilder filterCriteriaJson = new StringBuilder();

            filterCriteriaJson.append("(");
            for (FilterCriteria filterCriteria : this.filterCriteriaList) {
                filterCriteriaJson.append(filterCriteria.toJson()).append(" ").append(this.operator.getSerializedValue()).append(" ");
            }

            return filterCriteriaJson.delete(filterCriteriaJson.length() - (this.operator.getSerializedValue().length() + 2), filterCriteriaJson.length()) + ")";
        }
    }
}
