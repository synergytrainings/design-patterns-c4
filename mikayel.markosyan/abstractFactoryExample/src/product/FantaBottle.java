package product;

public class FantaBottle implements  Bottle {

    @Override
    public String getColor() {
        return "Orange";
    }

    @Override
    public Integer getWeight() {
        return Integer.valueOf(90);
    }
}
