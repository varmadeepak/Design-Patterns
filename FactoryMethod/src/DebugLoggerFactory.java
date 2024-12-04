public class DebugLoggerFactory implements LoggerFactory{
    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
}
