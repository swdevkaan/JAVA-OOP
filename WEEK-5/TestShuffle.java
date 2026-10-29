package deneme;

import java.util.ArrayList;

public class TestShuffle {

    public static void shuffle(ArrayList list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));

            Object temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // Örnek elemanlar ekleyelim (1'den 10'a kadar)
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Karıştırmadan önce: " + list);

        // Metodu çağır
        shuffle(list);

        System.out.println("Karıştırdıktan sonra:  " + list);
    }
}