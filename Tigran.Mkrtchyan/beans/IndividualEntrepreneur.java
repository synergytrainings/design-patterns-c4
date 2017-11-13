package beans;

import calculator.Calculator;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/13/2017.
 */
public class IndividualEntrepreneur extends Company implements Calculator{
    public IndividualEntrepreneur(BigDecimal income, BigDecimal expences, Double profitTaxes, Double incomeTaxes) {
        super(income, expences, profitTaxes, incomeTaxes);
    }

    public BigDecimal calculateProfit() {
        BigDecimal profit = income.subtract(expences);
        return profit.multiply(BigDecimal.ONE.subtract(new BigDecimal(incomeTaxes)), MathContext.DECIMAL128);
    }
}
