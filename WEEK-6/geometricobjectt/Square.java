package geometricobjectt;

public class Square extends GeometricObject implements Colorable {
    private double side;

    // No-arg constructor (side = 0)
    public Square() {
        this(0.0);
    }

    // Belirtilen side değeri ile constructor
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Colorable interface'inden gelen metodun uygulanması
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square: side = " + side;
    }
}