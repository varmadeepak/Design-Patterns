public class Product extends AbstractProductProtoType{
    private String name;
    private double price;

    Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public AbstractProductProtoType clone() {
        return new Product(name,price);
    }

    @Override
    public void display() {
        System.out.println("ProductName : " + name);
        System.out.println("ProductPrice : " + price);
    }
}
