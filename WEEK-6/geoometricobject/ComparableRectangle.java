package geoometricobject;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    // Kurucu metodlar (Constructors)
    public ComparableRectangle() {
        super();
    }

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public ComparableRectangle(double width, double height, String color, boolean filled) {
        super(width, height, color, filled);
    }

    /**
     * Comparable arayüzünden gelen compareTo metodunun ezilmesi (Override).
     * Nesneleri alanlarına (Area) göre karşılaştırır.
     */
    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Object sınıfından gelen equals metodunun ezilmesi.
     * Alanları eşit olan iki dikdörtgen eşit kabul edilir.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof ComparableRectangle) {
            return this.getArea() == ((ComparableRectangle) o).getArea();
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " | Alan: " + getArea();
    }
}