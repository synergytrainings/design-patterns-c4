package factory;

import product.Bottle;
import product.Water;

public interface AbstractFactory {
    Bottle createBottle();
    Water createWater();
}
