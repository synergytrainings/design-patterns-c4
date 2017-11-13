import beans.Company;
import beans.IndividualEntrepreneur;
import beans.LTD;
import beans.OJSC;
import calculator.Calculator;

import java.math.BigDecimal;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/13/2017.
 */
public class CompanyTypeSelector {

    public Calculator getCompany(CompanyType type, BigDecimal income, BigDecimal expences, double profitTaxes, double incomeTaxes){
        switch (type){
            case LTD: return new LTD(income, expences, profitTaxes, incomeTaxes);
            case OJSC: return new OJSC(income, expences, profitTaxes, incomeTaxes);
            default: return new IndividualEntrepreneur(income, expences, profitTaxes, incomeTaxes);
        }
    }
}

enum CompanyType{
    LTD,
    OJSC,
    INDIVIDUAL_ENTREPRENEUR
}
