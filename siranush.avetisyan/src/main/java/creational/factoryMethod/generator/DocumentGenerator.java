package designPatterns.creational.factoryMethod.generator;

import com.google.common.base.Strings;
import designPatterns.creational.factoryMethod.utilities.ExportHelper;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
public class DocumentGenerator extends BaseGenerator {

    public void generate(HttpServletRequest request, HttpServletResponse response) {

        String projectId = Strings.isNullOrEmpty((request.getParameter("projectId"))) ? null : request.getParameter("projectId");
        String exportedFileExtension = request.getParameter(ExportHelper.EXPORT_DOCUMENT_TYPE);

        String fileName = projectId + "-" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

        ExportTypes exportType = ExportTypes.findInstance(exportedFileExtension);

        if (exportType != null) {
            exportType.prepareExport(response);
        } else {
            Logger.getLogger(getClass()).error("no Export type was found by given key: " + exportedFileExtension);
            return;
        }

        exportType.getExporter().export();

        System.out.print("Exported Document file with name: " + fileName);

    }
}
