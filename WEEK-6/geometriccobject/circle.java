package geometriccobject;

public class circle extends geometriccobject {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle (Radius: " + radius + ", Area: " + String.format("%.2f", getArea()) + ")";
    }
}