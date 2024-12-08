import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;
    private double price;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
// Iterator interface
interface Iterator{
    Product first();
    Product next();
    boolean hasNext();
}

class ProductIterator implements Iterator{
    private List<Product> products;
    private int current;
    public ProductIterator(List<Product> products){
        this.products = products;
        this.current = 0;
    }


    @Override
    public Product first() {
        if(products.isEmpty()) return null;
        current = 0;
        return products.get(current);
    }

    @Override
    public Product next() {
        if(hasNext()){
            return products.get(++current);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return current < products.size() - 1;
    }
}
// Aggregate class that stores products and provides an iterator
class Inventory{
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }
    public Iterator createIterator(){
        return new ProductIterator(products);
    }
}
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop",999.2f);
        Product product2 = new Product("PC",1999.2f);

        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        Iterator iterator = inventory.createIterator();
        Product currentProduct = iterator.first();

        while(currentProduct != null){
            System.out.println("Product: " + currentProduct.getName() + ", Price: $" + currentProduct.getPrice());
            currentProduct = iterator.next();
        }
    }
}