import java.util.logging.Logger;

interface ILogger{
    void log(String message);
}

class InfoLogger implements ILogger{

    @Override
    public void log(String message) {
        System.out.println(message + "INFO_LOGGER");
    }
}

class DebugLogger implements ILogger{

    @Override
    public void log(String message) {
        System.out.println(message + "DEBUG_LOGGER");
    }
}
interface LoggerFactory{
    ILogger createLogger();
}

class InfoLoggerFactory implements LoggerFactory{
    @Override
    public ILogger createLogger() {
        return new InfoLogger();

    }
}

class DebugLoggerFactory implements LoggerFactory{

    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
}
public class Main {
    public static void main(String[] args) {
        LoggerFactory debugLoggerFactory = new DebugLoggerFactory();
        ILogger debugLogger = debugLoggerFactory.createLogger();
        debugLogger.log("Hello : ");
    }
}