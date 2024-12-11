public class Desktop {

    String motherboard;
    String processor;
    String memory;
    String storage;
    String graphicsCard;

    void display() {
        System.out.println("DesktopSpecs : ");
        System.out.println("MotherBoard : " + motherboard);
        System.out.println("Processor : " + processor);
        System.out.println("Memory : " + memory);
        System.out.println("Storage : " + storage);
        System.out.println("GraphicsCard : " + graphicsCard);
    }
}
