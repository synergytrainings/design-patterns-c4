package service;

import model.FactoryB;

/**
 * @author Tigran.Mkrtchyan
 * @since 12/20/2017.
 */
public class FactoryForFactoryInstance {

    private static FactoryB factoryB = new FactoryB();

    public static FactoryB getInstance(){
        return factoryB;
    };

}
