// COMPONENT
interface FoodItem{
    String getDescription();
    double getPrice();
}
// CONCRETE COMPONENTS

class Pizza implements FoodItem{

    @Override
    public String getDescription() {
        return "PIZZA";
    }

    @Override
    public double getPrice() {
        return 100f;
    }
}
class Burger implements FoodItem{

    @Override
    public String getDescription() {
        return "BURGER";
    }

    @Override
    public double getPrice() {
        return 65.3f;
    }
}

// DECORATOR

abstract class FoodDecorator implements FoodItem{
    protected FoodItem foodItem;

    FoodDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }
}

// CONCRETE DECORATORS
class ExtraCheeseDecorator extends FoodDecorator{
    private double extraCheesePrice;

    ExtraCheeseDecorator(FoodItem foodItem,double extraCheesePrice){
        super(foodItem);
        this.extraCheesePrice = extraCheesePrice;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + "ExtraCheese";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + extraCheesePrice;
    }
}
class ExtraSauceDecorator extends FoodDecorator{
    double extraSaucePrice;
    ExtraSauceDecorator(FoodItem foodItem,double extraSaucePrice){
        super(foodItem);
        this.extraSaucePrice = extraSaucePrice;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + "ExtraSauce";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + extraSaucePrice;
    }
}
public class Main {
    public static void main(String[] args) {

        FoodItem pizza = new Pizza(); // 100 $
        System.out.println("Original Price of pizza : " + pizza.getPrice());
        pizza = new ExtraCheeseDecorator(pizza,10f);
        System.out.println("Pizza Price with cheese : " + pizza.getPrice());
        System.out.println("Updated Description of Pizza : " + pizza.getDescription());
        pizza = new ExtraSauceDecorator(pizza,20f);
        System.out.println("Pizza Price with cheese & extra sauce : " + pizza.getPrice());
        System.out.println("Updated Description of Pizza with extra sauce : " + pizza.getDescription());
    }
}