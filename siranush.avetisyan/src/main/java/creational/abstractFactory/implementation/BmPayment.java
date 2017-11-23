package designPatterns.creational.abstractFactory.implementation;

import designPatterns.creational.abstractFactory.api.BasePayment;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class BmPayment extends BasePayment {

    private BigDecimal paymentBalance;

    public BmPayment(LocalDate paymentDate) {
        super(paymentDate);
    }

    public void setPaymentBalance(BigDecimal paymentBalance) {
        this.paymentBalance = paymentBalance;
    }

    @Override
    public void generatePaymentList() {
        System.out.print("Balsa Da Mae Payment List Generated in: " + this.paymentDate + ". Balance: " + this.paymentBalance + "\n");
    }

}
