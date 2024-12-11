public class Main {
    public static void main(String[] args) {
        LoggerFactory debugLoggerFactory = new DebugLoggerFactory();
        ILogger debugLogger = debugLoggerFactory.createLogger();
        debugLogger.log("Hello");
    }
}