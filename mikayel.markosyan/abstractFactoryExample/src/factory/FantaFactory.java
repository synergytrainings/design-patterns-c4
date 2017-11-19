package factory;

import product.Bottle;
import product.FantaBottle;
import product.FantaWater;
import product.Water;

public class FantaFactory implements  AbstractFactory {
    @Override
    public Bottle createBottle() {
        return new FantaBottle();
    }

    @Override
    public Water createWater() {
        return new FantaWater();
    }
}
