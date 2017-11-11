package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.generator.ExportTypes;

/**
 * @author Siranush.Avetisyan
 * @since 11/10/2017
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {

        ExportTypes.findInstance("pdf").getExporter().export();
        ExportTypes.findInstance("rtf").getExporter().export();
    }
}
