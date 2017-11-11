package designPatterns.creational.factoryMethod.generator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Siranush.Avetisyan
 * @since 11/8/2017
 */
public abstract class BaseGenerator {

    public abstract void generate(HttpServletRequest request, HttpServletResponse response);

}
