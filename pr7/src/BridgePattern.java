interface Color {
    void fillColor();
}
class BlackColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in black color");
    }
}
class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        color.fillColor();
    }
}

public class BridgePattern {
    public static void main(String[] args) {
        Color blackColor = new BlackColor();
        Color redColor = new RedColor();
        Shape blackRectangle = new Rectangle(blackColor);
        Shape redRectangle = new Rectangle(redColor);
        blackRectangle.draw();
        redRectangle.draw();
    }
}
