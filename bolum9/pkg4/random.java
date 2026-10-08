package bolum9.pkg4;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Seed değeri 1000 olan Random nesnesini oluşturuyoruz
        Random random = new Random(1000);

        // 50 kere çalışacak basit bir for döngüsü
        for (int i = 0; i < 50; i++) {
            // 0 ile 99 arasında rastgele sayı üretip yazdırıyoruz
            int sayi = random.nextInt(100);
            System.out.println(sayi);
        }
    }
}