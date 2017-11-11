package designPatterns.creational.factoryMethod.generator;

import designPatterns.creational.factoryMethod.model.Exporter;
import designPatterns.creational.factoryMethod.model.ExporterPDF;
import designPatterns.creational.factoryMethod.model.ExporterRTF;
import designPatterns.creational.factoryMethod.utilities.ConvertibleEnum;
import designPatterns.creational.factoryMethod.utilities.ReverseEnumMap;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
public enum ExportTypes implements ConvertibleEnum<String> {

    PDF("pdf") {
        @Override
        public Exporter getExporter() {
            return new ExporterPDF();
        }

        @Override
        public void prepareExport(HttpServletResponse response) {
            // TODO: Sets default headers to the given response for PDF export
        }

    },
    RTF("rtf") {
        @Override
        public Exporter getExporter() {
            return new ExporterRTF();
        }

        @Override
        public void prepareExport(HttpServletResponse response) {
            // TODO: Sets default headers to the given response for RTF export
        }
    };

    private final String key;

    ExportTypes(String key) {
        this.key = key;
    }

    @Override
    public String convert() {
        return key;
    }

    public abstract Exporter getExporter();

    public abstract void prepareExport(HttpServletResponse response);

    private static ReverseEnumMap<String, ExportTypes> INSTANCE_FINDER = new ReverseEnumMap<>(ExportTypes.class);

    public static ExportTypes findInstance(String key) {
        return INSTANCE_FINDER.findInstance(key);
    }
}
