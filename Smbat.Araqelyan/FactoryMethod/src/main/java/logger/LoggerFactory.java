package logger;

public class LoggerFactory {
    public Logger getLogger(LoggerType loggerType) {
        Logger logger;
        switch (loggerType) {
            case DATABASE:
                logger = new DatabaseLogger();
                break;
            case FILE:
                logger = new FileLogger();
                break;
            default:
                logger = new ConsoleLogger();
        }
        return logger;
    }
}
