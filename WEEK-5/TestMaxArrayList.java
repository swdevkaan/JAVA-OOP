package deneme;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMaxArrayList {

    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Integer maxVal = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > maxVal) {
                maxVal = current;
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();

        System.out.println("Sayıları girin (bitirmek için 0 yazın):");

        int number = input.nextInt();
        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }

        Integer maximum = max(list);

        if (maximum == null) {
            System.out.println("Hiç sayı girilmedi veya liste boş.");
        } else {
            System.out.println("Girilen en büyük sayı: " + maximum);
        }

        input.close();
    }
}