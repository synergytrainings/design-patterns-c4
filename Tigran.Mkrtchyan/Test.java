import beans.Company;

import java.math.BigDecimal;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/13/2017.
 */
public class Test {
    public static void main(String... args) {
        CompanyTypeSelector selector = new CompanyTypeSelector();

        Company company = selector.getCompany(CompanyType.LTD, new BigDecimal(28000000.15), new BigDecimal(12000000.15), 0.4, 0.35);
        System.out.println("Ltd. profit: " + company.calculateProfit());

        company = selector.getCompany(CompanyType.OJSC, new BigDecimal(28000000.15), new BigDecimal(12000000.15), 0.4, 0.35);
        System.out.println("OJSC. profit: " + company.calculateProfit());

        company = selector.getCompany(CompanyType.INDIVIDUAL_ENTREPRENEUR, new BigDecimal(28000000.15), new BigDecimal(12000000.15), 0.4, 0.35);
        System.out.println("Individual Entrepreneur profit: " + company.calculateProfit());

    }
}
