public class LoggerFactory {
    public static ILogger createLogger(LOGLEVEL loglevel){
        switch (loglevel) {
            case INFO -> {
                return new InfoLogger();
            }
            case DEBUG -> {
                return new DebugLogger();
            }
        };
        return null;
    }
}
