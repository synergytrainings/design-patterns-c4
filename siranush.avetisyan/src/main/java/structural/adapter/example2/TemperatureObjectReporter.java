package designPatterns.structural.adapter.example2;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class TemperatureObjectReporter implements TemperatureInfo {

    private CelsiusReporter celsiusReporter;

    public TemperatureObjectReporter() {
        this.celsiusReporter = new CelsiusReporter();
    }

    @Override
    public double getTemperatureInC() {
        return this.celsiusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.celsiusReporter.setTemperature(temperatureInC);
    }

    @Override
    public double getTemperatureInF() {
        return TemperatureConverter.cToF(this.celsiusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.celsiusReporter.setTemperature(TemperatureConverter.fToC(temperatureInF));
    }
}
