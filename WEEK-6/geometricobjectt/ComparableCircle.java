package geometricobjectt;

public class ComparableCircle extends Circle {

    public ComparableCircle(double radius) {
        super(radius);
    }

    // GeometricObject'ten miras alınan compareTo metodunu override ediyoruz
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
}