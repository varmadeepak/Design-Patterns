abstract class DesktopBuilder {
    protected Desktop desktop;

    abstract DesktopBuilder buildMotherboard();

    abstract DesktopBuilder buildProcessor();

    abstract DesktopBuilder buildMemory();

    abstract DesktopBuilder buildStorage();

    abstract DesktopBuilder buildGraphicsCard();

    Desktop build() {
        return desktop;
    }
}
