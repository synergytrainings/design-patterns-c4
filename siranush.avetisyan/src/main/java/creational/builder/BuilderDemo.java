package designPatterns.creational.builder;

import java.util.Arrays;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class BuilderDemo {

    public static void main(String[] args) {
        FilterBuilder householdFilterBuilder = new FilterBuilder();
        householdFilterBuilder.is("WFStateID", 1);
        householdFilterBuilder.contains("HouseholdCode", "0012");

        FilterBuilder personFilterBuilder = new FilterBuilder();
        personFilterBuilder.in("GenderID", Arrays.asList(1, 2));
        personFilterBuilder.gte("Age", 18);

        System.out.print(householdFilterBuilder.or(personFilterBuilder.build()).buildToJson());
    }
}
