public class Main {
    public static void main(String[] args) {
        // This is a client

        // Clients Interaction will be only with LoggerFactory

        ILogger debugLogger = LoggerFactory.createLogger(LOGLEVEL.DEBUG);
        debugLogger.log("Hello");
    }
}