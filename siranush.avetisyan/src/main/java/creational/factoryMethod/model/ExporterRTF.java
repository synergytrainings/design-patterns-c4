package designPatterns.creational.factoryMethod.model;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
public class ExporterRTF implements Exporter{

    @Override
    public void export() {
        System.out.print("Export to RTF.");
    }
}
