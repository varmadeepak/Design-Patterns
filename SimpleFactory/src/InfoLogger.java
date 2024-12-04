public class InfoLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println(message + " InfoLogger");
    }
}
