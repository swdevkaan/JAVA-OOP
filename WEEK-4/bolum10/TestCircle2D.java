package bolum10;

public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("c1 Alanı: " + c1.getArea());
        System.out.println("c1 Çevresi: " + c1.getPerimeter());

        System.out.println("----------------------------------------");
        System.out.println("c1, (3, 3) noktasını içeriyor mu? " + c1.contains(3, 3));
        System.out.println("c1, Circle2D(4, 5, 10.5) çemberini içeriyor mu? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1, Circle2D(3, 5, 2.3) çemberiyle örtüşüyor mu? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}