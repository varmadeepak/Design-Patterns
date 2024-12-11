// SUBJECT
interface Image{
    void display();
}

class RealImage implements Image{
    private String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading Image From Disk :  " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image : " + fileName);
    }
}

class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    ProxyImage(String fileName){
        this.fileName = fileName;
        this.realImage = null;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
public class Main {
    public static void main(String[] args) {

        Image proxy = new ProxyImage("test_image.png");
        proxy.display();

        proxy.display();
    }
}