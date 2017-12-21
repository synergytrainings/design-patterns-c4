package designPatterns.structural.adapter.example2;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public interface TemperatureInfo {

    public double getTemperatureInC();

    public void setTemperatureInC(double temperatureInC);

    public double getTemperatureInF();

    public void setTemperatureInF(double temperatureInF);

}
