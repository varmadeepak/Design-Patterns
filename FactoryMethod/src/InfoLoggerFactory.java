public class InfoLoggerFactory implements LoggerFactory{
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }
}
