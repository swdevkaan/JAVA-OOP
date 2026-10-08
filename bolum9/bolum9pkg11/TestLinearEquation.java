package bolum9pkg11;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a, b, c, d, e, f degerlerini giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("bu esitligin sonucu yok.");
        }
    }
}