package deneme;

import java.util.ArrayList;

public class ShuffleArrayList {

    public static void shuffle(ArrayList list) {
        for (int i = list.size() - 1; i > 0; i--) {
             int randomIndex = (int) (Math.random() * (i + 1));

             Object temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}