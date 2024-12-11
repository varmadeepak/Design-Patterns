// INTERFACE
interface ILogger{
    void log(String message);
}


enum LOGLEVEL{
    DEBUUG , INFO , ERROR
}

// CONCRETE IMPLEMENTATIONS
class DebugLogger implements ILogger{

    @Override
    public void log(String message) {
        System.out.println(message + "DEBUG_LOGGER");
    }
}

class InfoLogger implements ILogger{

    @Override
    public void log(String message) {
        System.out.println(message + "INFO_LOGGER");
    }
}

// FACTORY
class LoggerFactory{
    public static ILogger createLogger(LOGLEVEL logLevel){
        if(logLevel.equals(LOGLEVEL.INFO)){
            return new InfoLogger();
        }
        else if(logLevel.equals(LOGLEVEL.DEBUUG)){
            return new DebugLogger();
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LOGLEVEL.DEBUUG);
        debugLogger.log("Hello : ");
    }
}