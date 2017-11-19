package product;

public class FantaWater implements Water  {
    @Override
    public String getColor() {
        return "Orange";
    }

    @Override
    public Integer getTemperature() {
        return Integer.valueOf(20);
    }
}
