package bolum10;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir tam sayı girin: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

         int factor = 2;
        int tempNumber = number;
        
        while (factor <= tempNumber) {
            if (tempNumber % factor == 0) {
                stack.push(factor);
                tempNumber /= factor;
            } else {
                factor++;
            }
        }

         System.out.print(number + " sayisinin asal çarpanlari (büyükten küçüğe): ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + (stack.empty() ? "" : ", "));
        }
        System.out.println();
    }
}