package geometricobjectt;

public class TestGeometricObjectArray {
    public static void main(String[] args) {
        GeometricObject[] objects = {
            new Circle(5.0),
            new Circle(3.0),
            new Rectangle(2.0, 4.0),
            new Rectangle(3.0, 5.0)
        };

        double totalArea = sumArea(objects);
        System.out.printf("Dizideki nesnelerin toplam alanı: %.2f\n", totalArea);
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject obj : a) {
            sum += obj.getArea();
        }
        return sum;
    }
}