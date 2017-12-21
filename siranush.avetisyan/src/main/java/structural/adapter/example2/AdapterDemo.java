package designPatterns.structural.adapter.example2;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class AdapterDemo {

    public static void main(String[] args) {
        TemperatureInfo tempInfo;

        // class adapter
        System.out.println("class adapter test");
        tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);

        // object adapter
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);

    }

    private static void testTempInfo(TemperatureInfo tempInfo) {
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());

        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());
    }

}
