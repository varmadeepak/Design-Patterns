public class GUIFactory {
    public static Ifactory createFactory(String osType) {
        if(osType.equals("Mac")){
            return new MacFactory();
        }
        else if(osType.equals("Windows")){
            return new WinFactory();
        }

        return null;
    }
}
