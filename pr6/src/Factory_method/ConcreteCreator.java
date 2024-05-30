package Factory_method;

public class ConcreteCreator {
    public static FoodFactory factoryMethod(String food){
        if (food.equalsIgnoreCase("pasta")){
            return new PastaFactory();
        } else {
            return new PizzaFactory();
        }
    }

}
