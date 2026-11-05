package geometricobjectt;

public class TestOctagon {
    public static void main(String[] args) {
         Octagon oct1 = new Octagon(5.0);

         System.out.println("=== Octagon 1 Bilgileri ===");
        System.out.printf("Alan    : %.2f\n", oct1.getArea());
        System.out.printf("Çevre   : %.2f\n", oct1.getPerimeter());

         Octagon oct2 = (Octagon) oct1.clone();

         System.out.println("\n=== Kopyalama ve Karşılaştırma Testi ===");
        int compareResult = oct1.compareTo(oct2);

        if (compareResult == 0) {
            System.out.println("oct1 ve kopyalanan oct2 birbirine EŞİTTİR (Alanları aynı).");
        } else if (compareResult > 0) {
            System.out.println("oct1, oct2'den DAHA BÜYÜKTÜR.");
        } else {
            System.out.println("oct1, oct2'den DAHA KÜÇÜKTÜR.");
        }
    }
}