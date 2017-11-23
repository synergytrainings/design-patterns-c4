package designPatterns.creational.abstractFactory.implementation;

import designPatterns.creational.abstractFactory.api.BasePaymentDaoFactory;
import designPatterns.creational.abstractFactory.api.DaoItemInitializer;

import java.time.LocalDate;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class EdPaymentDaoFactory extends BasePaymentDaoFactory {

    private static final DaoItemInitializer<EdPayment> DAO_ITEM_INITIALIZER = row -> {
        EdPayment edPaymentList = new EdPayment((LocalDate) row.get("PaymentDate"));
        edPaymentList.setPaymentType((String) row.get("PaymentType"));
        return edPaymentList;
    };

    @Override
    public DaoItemInitializer<EdPayment> getPaymentListInitializer() {
        return DAO_ITEM_INITIALIZER;
    }
}
