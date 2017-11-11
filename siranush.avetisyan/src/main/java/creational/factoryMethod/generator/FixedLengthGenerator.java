package designPatterns.creational.factoryMethod.generator;

import com.google.common.base.Strings;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
public class FixedLengthGenerator extends BaseGenerator {

    public void generate(HttpServletRequest request, HttpServletResponse response) {
        String projectId = Strings.isNullOrEmpty((request.getParameter("projectId"))) ? null : request.getParameter("projectId");

        String fileName = projectId + "-" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

        response.setContentType("text/plain");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + ".txt\"");

        System.out.print("Exported FixedLength file with name: " + fileName);
    }
}
