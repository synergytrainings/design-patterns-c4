package designPatterns.creational.abstractFactory.implementation;

import designPatterns.creational.abstractFactory.api.BasePaymentDaoFactory;
import designPatterns.creational.abstractFactory.api.DaoItemInitializer;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class BmPaymentDaoFactory extends BasePaymentDaoFactory {

    private static final DaoItemInitializer<BmPayment> DAO_ITEM_INITIALIZER = row -> {
        BmPayment bmPaymentList = new BmPayment((LocalDate) row.get("PaymentDate"));
        BigDecimal balance = (BigDecimal) row.get("Balance_USD");
        bmPaymentList.setPaymentBalance(balance == null ? BigDecimal.ZERO : balance);
        return bmPaymentList;
    };

    @Override
    public DaoItemInitializer<BmPayment> getPaymentListInitializer() {
        return DAO_ITEM_INITIALIZER;
    }
}
