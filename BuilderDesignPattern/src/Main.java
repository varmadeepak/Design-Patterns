public class Main {
    public static void main(String[] args) {

        // Director
        DesktopDirector desktopDirector = new DesktopDirector();

        // Dell Desktop

        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop dellDesktop = desktopDirector.buildDesktop(dellDesktopBuilder);

        // HP Desktop

        HpDesktopBuilder hpDesktopBuilder = new HpDesktopBuilder();
        Desktop hpDesktop = desktopDirector.buildDesktop(hpDesktopBuilder);

        dellDesktop.display();
        hpDesktop.display();

    }
}