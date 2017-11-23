package designPatterns.creational.abstractFactory.api;

import designPatterns.creational.abstractFactory.PortfolioTab;
import designPatterns.creational.abstractFactory.implementation.BmPaymentDaoFactory;
import designPatterns.creational.abstractFactory.implementation.EdPaymentDaoFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 11/20/2017
 */
public class PaymentDao {

    private static PaymentDao INSTANCE;

    private static Map<PortfolioTab, BasePaymentDaoFactory> portfolioDaoMap;

    static {
        portfolioDaoMap = new HashMap<>();
        portfolioDaoMap.put(PortfolioTab.BOLSA_DA_MAE, new BmPaymentDaoFactory());
        portfolioDaoMap.put(PortfolioTab.EMERGENCY_DATABASE, new EdPaymentDaoFactory());
    }

    public static PaymentDao getInstance() {
        if (INSTANCE == null) {
            synchronized (PaymentDao.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PaymentDao();
                }
            }
        }
        return INSTANCE;
    }

    public BasePaymentDaoFactory newPaymentDao(PortfolioTab portfolioTab) {
        BasePaymentDaoFactory basePaymentDaoFactory = portfolioDaoMap.get(portfolioTab);

        if (basePaymentDaoFactory == null) {
            throw new IllegalArgumentException(String.format("Unsupported portfolio tab %s", portfolioTab));
        }

        return basePaymentDaoFactory;
    }

}
