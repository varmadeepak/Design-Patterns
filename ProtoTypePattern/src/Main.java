public class Main {
    public static void main(String[] args) {
        AbstractProductProtoType productProtoType1 = new Product("Xiaomi Pad 7" , 25600f);
        AbstractProductProtoType productProtoType2 = new Product("Ipad_10th_Gen" , 29600f);

        // Creating clones

        AbstractProductProtoType clonedProduct1 = productProtoType1.clone();
        AbstractProductProtoType clonedProduct2 = productProtoType2.clone();

        System.out.println("OG Products : ");
        productProtoType1.display();
        productProtoType2.display();

        System.out.println("\nClone Products : ");
        clonedProduct1.display();
        clonedProduct2.display();

    }
}
