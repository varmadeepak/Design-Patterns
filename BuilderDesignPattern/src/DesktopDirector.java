public class DesktopDirector {
    Desktop buildDesktop(DesktopBuilder builder){
        return builder
                .buildProcessor()
                .buildGraphicsCard()
                .buildMemory()
                .buildMotherboard()
                .buildStorage()
                .build();
    }
}
