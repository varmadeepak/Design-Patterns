// SUBSYSTEMS

import java.awt.color.CMMException;

class CPU{
    void startCPU(){
        System.out.println("START UP OF CPU");
    }
    void executeInstructions(){
        System.out.println("CPU EXECUTING INSTRUCTIONS");
    }
}
class Memory{
    void initializeMemory(){
        System.out.println("INITIALIZED MEMORY");
    }
}
class GPU{
    void enableGraphics(){
        System.out.println("GPU GRAPHICS ARE ENABLED ");
    }
}
class DiskDrive{
    void loadOSFromDisk(){
        System.out.println("BOOTING OS FROM DISK");
    }
}
class NetworkInterface{
    void connectToNetwork(){
        System.out.println("CONNECTED TO INTERNET");
    }
}

// FACADE

class ComputerFacade{
    private CPU cpu;
    private Memory memory;
    private GPU gpu;
    private DiskDrive diskDrive;
    private NetworkInterface networkInterface;

    ComputerFacade(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.gpu = new GPU();
        this.diskDrive = new DiskDrive();
        this.networkInterface = new NetworkInterface();
    }

    public void startComputer() {
        System.out.println("Starting the computer ---- :");
        cpu.startCPU();
        memory.initializeMemory();
        gpu.enableGraphics();
        diskDrive.loadOSFromDisk();
        networkInterface.connectToNetwork();
        cpu.executeInstructions();
        System.out.println("COMPUTER IS READY TO USE");
    }
}
public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}