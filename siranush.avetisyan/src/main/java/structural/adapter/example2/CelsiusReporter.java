package designPatterns.structural.adapter.example2;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class CelsiusReporter {

    protected double temperatureInC;

    public double getTemperature() {
        return temperatureInC;
    }

    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}
