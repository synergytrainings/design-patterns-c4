package product;

public class CocaColaWater implements Water {
    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public Integer getTemperature() {
        return Integer.valueOf(28);
    }
}
