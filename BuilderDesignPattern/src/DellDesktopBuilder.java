public class DellDesktopBuilder extends DesktopBuilder{
    DellDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    DesktopBuilder buildMotherboard() {
        desktop.motherboard = "Dell_Motherboard";
        return this;
    }

    @Override
    DesktopBuilder buildProcessor() {
        desktop.processor = "I5 15th Gen";
        return this;
    }

    @Override
    DesktopBuilder buildMemory() {
        desktop.memory = "32 GB DDR7 RAM";
        return this;
    }

    @Override
    DesktopBuilder buildStorage() {
        desktop.storage = "512GB SSD + 2TB HDD";
        return this;
    }

    @Override
    DesktopBuilder buildGraphicsCard() {
        desktop.graphicsCard = "NvDIA_RTX_4090_Super";
        return this;
    }
}
