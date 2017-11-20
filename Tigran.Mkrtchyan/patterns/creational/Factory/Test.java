import beans.Company;
import calculator.Calculator;

import java.math.BigDecimal;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/13/2017.
 */
public class Test {
    public static void main(String... args) {
        CompanyTypeSelector selector = new CompanyTypeSelector();

        Calculator calculator = selector.getCompany(CompanyType.LTD, new BigDecimal(28000000.15), new BigDecimal(12000000.15), 0.4, 0.35);
        System.out.println("Ltd. profit: " + calculator.calculateProfit());

        calculator = selector.getCompany(CompanyType.OJSC, new BigDecimal(28000000.15), new BigDecimal(12000000.15), 0.4, 0.35);
        System.out.println("OJSC. profit: " + calculator.calculateProfit());

        calculator = selector.getCompany(CompanyType.INDIVIDUAL_ENTREPRENEUR, new BigDecimal(28000000.15), new BigDecimal(12000000.15), 0.4, 0.35);
        System.out.println("Individual Entrepreneur profit: " + calculator.calculateProfit());

    }
}
