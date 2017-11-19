package Client;

import factory.AbstractFactory;
import product.Bottle;
import product.Water;

public class Client {
    private Water water;
    private Bottle bottle;

    public Client(AbstractFactory abstractFactory) {
        water = abstractFactory.createWater();
        bottle = abstractFactory.createBottle();
    }

    @Override
    public String toString() {
        return "Client{" +
                "water=" + water.getColor() + water.getTemperature()+
                ", bottle=" + bottle.getColor() +bottle.getWeight()+
                '}';
    }
}
