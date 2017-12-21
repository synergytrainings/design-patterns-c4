package designPatterns.structural.adapter.example2;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class TemperatureClassReporter extends CelsiusReporter implements TemperatureInfo {

    @Override
    public double getTemperatureInC() {
        return temperatureInC;
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

    @Override
    public double getTemperatureInF() {
        return TemperatureConverter.cToF(temperatureInC);
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = TemperatureConverter.fToC(temperatureInF);
    }

}
