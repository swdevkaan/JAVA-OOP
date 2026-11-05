package geometricobjectt;

public class TestColorable {
    public static void main(String[] args) {
        // 5 elemanlı GeometricObject dizisi
        GeometricObject[] objects = new GeometricObject[5];

        objects[0] = new Square(4.5);
        objects[1] = new Circle(3.0);
        objects[2] = new Rectangle(2.0, 5.0);
        objects[3] = new Square(7.0);
        objects[4] = new Circle(1.5);

        // Her bir nesne için alan gösterimi ve Colorable kontrolü
        for (int i = 0; i < objects.length; i++) {
            System.out.println("--- Nesne #" + (i + 1) + " (" + objects[i].getClass().getSimpleName() + ") ---");
            System.out.printf("Alan: %.2f\n", objects[i].getArea());

            // Nesne Colorable interface'ini implement ediyor mu kontrolü
            if (objects[i] instanceof Colorable) {
                System.out.print("Boyama Talimatı: ");
                ((Colorable) objects[i]).howToColor();
            } else {
                System.out.println("Bu şekil renklendirilebilir (Colorable) değil.");
            }
            System.out.println();
        }
    }
}