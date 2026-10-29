package deneme;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Lutfen 5 adet kelime/metin girin:");

        // 5 metni alip stack'e ekle
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". metin: ");
            stack.push(input.nextLine());
        }

        // LIFO (Last In First Out) mantigiyla ters sirada cikarip yazdir
        System.out.println("\nMetinlerin ters sirayla cikti hali:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        input.close();
    }
}