package logger;

public class DatabaseLogger implements Logger {
    public void log(String message) {
        System.out.println("Logging to database: " + message);
    }
}
