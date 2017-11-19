package product;

public class CocaColaBottle implements  Bottle {
    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public Integer getWeight() {
        return Integer.valueOf(100);
    }
}
