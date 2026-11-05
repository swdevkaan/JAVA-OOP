package geometricobjectt;

public class Octagon extends GeometricObject implements Cloneable {
    private double side;

     public Octagon() {
        this(0.0);
    }

     public Octagon(double side) {
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
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

     @Override
     public int compareTo(GeometricObject o) {
         if (this.getArea() > o.getArea()) {
             return 1;
         } else if (this.getArea() < o.getArea()) {
             return -1;
         } else {
             return 0;
         }
     }

     @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}