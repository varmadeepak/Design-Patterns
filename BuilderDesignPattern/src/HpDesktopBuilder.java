public class HpDesktopBuilder extends DesktopBuilder{
    HpDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    DesktopBuilder buildMotherboard() {
        desktop.motherboard = "HP_Motherboard";
        return this;
    }

    @Override
    DesktopBuilder buildProcessor() {
        desktop.processor = "I7 15th Gen";
        return this;
    }

    @Override
    DesktopBuilder buildMemory() {
        desktop.memory = "64 GB DDR7 RAM";
        return this;
    }

    @Override
    DesktopBuilder buildStorage() {
        desktop.storage = "1TB SSD + 2TB HDD";
        return this;
    }

    @Override
    DesktopBuilder buildGraphicsCard() {
        desktop.graphicsCard = "NvDIA_RTX_4090_Super";
        return this;
    }
}
