import java.util.ArrayList;
import java.util.List;

// COMPONENT [ABSTRACTION]
interface FileSystemComponent{
    void listContents();
    int getSize();
}

// LEAF

class File implements FileSystemComponent{
    private String name;
    private int size;
    File(String name,int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public void listContents() {
        System.out.println("File Contents for file : " + name);
    }

    @Override
    public int getSize() {
        return size;
    }
}


// COMPOSITE
class Directory implements FileSystemComponent{
    private String directoryName;
    private List<FileSystemComponent> directoryContents;

    Directory(String directoryName){
        this.directoryName = directoryName;
        this.directoryContents = new ArrayList<>();
    }
    public void addContentToDirectory(FileSystemComponent fileSystemComponent){
        directoryContents.add(fileSystemComponent);
    }

    @Override
    public void listContents() {
        System.out.println("Directory : " + directoryName);
        for (FileSystemComponent components : directoryContents){
            components.listContents();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for(FileSystemComponent component : directoryContents){
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
public class Main {
    public static void main(String[] args) {

        Directory rootDirectory = new Directory("ROOT");

        FileSystemComponent file_1 = new File("File1.txt",10);
        FileSystemComponent file_2 = new File("File2.txt",20);

        Directory subDirectory = new Directory("SUB_DIRECTORY");
        FileSystemComponent file_3 = new File("File3.csv",30);

        subDirectory.addContentToDirectory(file_3);


        rootDirectory.addContentToDirectory(file_1);
        rootDirectory.addContentToDirectory(file_2);
        rootDirectory.addContentToDirectory(subDirectory);

        rootDirectory.listContents();

        int totalDirectorySize = rootDirectory.getSize();

        System.out.println("Total Directory Size : " + totalDirectorySize);
    }
}