package Factory_method;

public class PizzaFactory implements FoodFactory{
    @Override
    public Product createFood() {
        return new Pizza();
    }

}