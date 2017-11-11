package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.utilities.ExportHelper;
import designPatterns.creational.factoryMethod.generator.BaseGenerator;
import designPatterns.creational.factoryMethod.generator.DocumentGenerator;
import designPatterns.creational.factoryMethod.generator.FixedLengthGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
@WebServlet("/exportServlet")
public class ExportServlet extends HttpServlet {

    /**
     * he serialVersionUID unique id for this class
     */
    private static final long serialVersionUID = -8626975978148582028L;


    private static Map<String, BaseGenerator> generators;

    // here you can add your generator
    static {
        generators = new HashMap<>();
        generators.put(ExportHelper.GENERATE_DOCUMENT, new DocumentGenerator());
        generators.put(ExportHelper.GENERATE_FIXED_LENGTH, new FixedLengthGenerator());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String generateFlag = request.getParameter(ExportHelper.GENERATE_FLAG);
        BaseGenerator generator = generators.get(generateFlag);

        if (generator == null) {
            throw new InvalidGeneratorFlagException("the key: " + generateFlag + " not exists.");
        }

        generator.generate(request, response);
    }
}
