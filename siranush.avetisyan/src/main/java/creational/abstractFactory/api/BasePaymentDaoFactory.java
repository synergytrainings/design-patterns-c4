package designPatterns.creational.abstractFactory.api;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public abstract class BasePaymentDaoFactory {

    public abstract DaoItemInitializer<? extends BasePayment> getPaymentListInitializer();

}
