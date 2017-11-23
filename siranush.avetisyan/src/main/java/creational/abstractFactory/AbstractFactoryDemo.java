package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.api.BasePayment;
import designPatterns.creational.abstractFactory.api.PaymentDao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Map<String, Object> rows = new HashMap<>();
        rows.put("PaymentDate", LocalDate.now());
        rows.put("Balance_USD", BigDecimal.TEN);

        BasePayment basePayment = PaymentDao.getInstance().newPaymentDao(PortfolioTab.BOLSA_DA_MAE).getPaymentListInitializer().init(rows);
        basePayment.generatePaymentList();

        rows = new HashMap<>();
        rows.put("PaymentDate", LocalDate.of(2014, 10, 25));
        rows.put("PaymentType", "Humanitarian");

        basePayment = PaymentDao.getInstance().newPaymentDao(PortfolioTab.EMERGENCY_DATABASE).getPaymentListInitializer().init(rows);
        basePayment.generatePaymentList();
    }
}
