package beans;

import java.math.BigDecimal;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/13/2017.
 */
public abstract class Company {

     BigDecimal income;
     BigDecimal expences;
     Double profitTaxes;
     Double incomeTaxes;

    public Company(BigDecimal income, BigDecimal expences, Double profitTaxes, Double incomeTaxes) {
        this.income = income;
        this.expences = expences;
        this.profitTaxes = profitTaxes;
        this.incomeTaxes = incomeTaxes;
    }
}
