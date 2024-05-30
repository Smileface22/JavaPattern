package Factory_method;

public class Test {
    public static void main(String[] args) {
        FoodFactory foodFactory = ConcreteCreator.factoryMethod("burger");
        Product product = foodFactory.createFood();
        product.eat();

        FoodFactory foodFactory2 = ConcreteCreator.factoryMethod("pizza");
        Product product2 = foodFactory2.createFood();
        product2.eat();
    }

}
