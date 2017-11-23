package designPatterns.creational.abstractFactory.implementation;

import designPatterns.creational.abstractFactory.api.BasePayment;

import java.time.LocalDate;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class EdPayment extends BasePayment {

    private String paymentType;

    public EdPayment(LocalDate paymentDate) {
        super(paymentDate);
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public void generatePaymentList() {
        System.out.print("Emergency " + this.paymentType + " Database Payment List Generated in: " + this.paymentDate);
    }

}
