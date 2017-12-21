package designPatterns.structural.adapter.example2;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public final class TemperatureConverter {

    public static double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    public static double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}
