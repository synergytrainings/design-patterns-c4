package designPatterns.creational.abstractFactory.api;

import java.time.LocalDate;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public abstract class BasePayment {

    protected LocalDate paymentDate;

    public BasePayment(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public abstract void generatePaymentList();

}
