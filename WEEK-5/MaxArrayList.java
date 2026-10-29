import java.util.ArrayList;

public class MaxArrayList {

    public static Integer max(ArrayList list) {
        // Liste null veya boş ise null döndür
        if (list == null || list.size() == 0) {
            return null;
        }

        // İlk elemanı en büyük varsay
        Integer maxVal = (Integer) list.get(0);

        // Diğer elemanları kontrol et
        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > maxVal) {
                maxVal = current;
            }
        }

        return maxVal;
    }
}