package geometriccobject;
public class Testgeometriccobject {
    public static void main(String[] args) {
        circle c1 = new circle(5.0);
        circle c2 = new circle(5.0);
        circle c3 = new circle(8.0);

        System.out.println("--- equals Testi ---");
        System.out.println("c1 ve c2 eşit mi? (r=5 vs r=5): " + c1.equals(c2)); // true dönmeli
        System.out.println("c1 ve c3 eşit mi? (r=5 vs r=8): " + c1.equals(c3)); // false dönmeli

        System.out.println("\n--- compareTo Testi ---");
        System.out.println("c1 vs c2 (Karşılaştırma): " + c1.compareTo(c2)); // 0 (Eşit)
        System.out.println("c1 vs c3 (Karşılaştırma): " + c1.compareTo(c3)); // -1 (c1 küçük)
        System.out.println("c3 vs c1 (Karşılaştırma): " + c3.compareTo(c1)); // 1 (c3 büyük)
    }
}