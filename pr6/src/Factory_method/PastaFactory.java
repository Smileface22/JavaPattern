package Factory_method;

public class PastaFactory implements FoodFactory{
    @Override
    public Product createFood() {
        return new Pasta();
    }

}
