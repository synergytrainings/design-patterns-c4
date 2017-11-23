package designPatterns.creational.abstractFactory.api;

import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public interface DaoItemInitializer<T extends BasePayment> {

    T init(Map<String, Object> row);

}
