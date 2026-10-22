package bolum10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {

    public static BigDecimal calculateE(int numberOfTerms) {
        BigDecimal e = BigDecimal.ONE;      // e = 1
        BigDecimal item = BigDecimal.ONE;   // Her adımdaki 1/i! değeri

        for (int i = 1; i <= numberOfTerms; i++) {
            // Bir önceki terimi i'ye bölerek virgülden sonra 25 basamak hassasiyet alıyoruz
            item = item.divide(new BigDecimal(i), 25, RoundingMode.HALF_UP);
            e = e.add(item);
        }

        return e;
    }
}