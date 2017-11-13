package beans;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/13/2017.
 */
public class LTD extends Company {
    public LTD(BigDecimal income, BigDecimal expences, Double profitTaxes, Double incomeTaxes) {
        super(income, expences, profitTaxes, incomeTaxes);
    }

    public BigDecimal calculateProfit() {
        BigDecimal profit = income.subtract(expences);
        return profit.multiply(BigDecimal.ONE.subtract(new BigDecimal(profitTaxes)), MathContext.DECIMAL32);
    }
}
