import logger.Logger;
import logger.LoggerFactory;
import logger.LoggerType;

public class Test {
    public static void main(String []args) {
        LoggerFactory factory = new LoggerFactory();
        Logger msgLogger = factory.getLogger(LoggerType.FILE);
        msgLogger.log("Sample log message" + "\n");
    }
}
