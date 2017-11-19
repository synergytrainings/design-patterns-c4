package factory;

import product.Bottle;
import product.CocaColaBottle;
import product.CocaColaWater;
import product.Water;

public class CocaColaFactory implements AbstractFactory {
    @Override
    public Bottle createBottle() {
        return new CocaColaBottle();
    }

    @Override
    public Water createWater() {
        return new CocaColaWater();
    }
}
