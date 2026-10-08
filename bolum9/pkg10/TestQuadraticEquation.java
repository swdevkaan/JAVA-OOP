package bolum9.pkg10;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("a, b ve c değerlerini giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

         QuadraticEquation denklem = new QuadraticEquation(a, b, c);

        double delta = denklem.getDiscriminant();

         if (delta > 0) {
            System.out.println("Kök 1: " + denklem.getRoot1());
            System.out.println("Kök 2: " + denklem.getRoot2());
        } else if (delta == 0) {
            System.out.println("Tek Kök: " + denklem.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}