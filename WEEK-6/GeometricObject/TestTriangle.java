package GeometricObject;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 3 kenarını giriniz (örnek: 3 4 5): ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Rengi giriniz: ");
        String color = input.next();

        System.out.print("Üçgen dolu mu? (true/false): ");
        boolean filled = input.nextBoolean();

        // Triangle nesnesi oluşturma ve üst sınıf özelliklerini ayarlama
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Sonuçları yazdırma
        System.out.println("\n--- Üçgen Detayları ---");
        System.out.println("Alan: " + triangle.getArea());
        System.out.println("Çevre: " + triangle.getPerimeter());
        System.out.println("Renk: " + triangle.getColor());
        System.out.println("Dolu mu?: " + triangle.isFilled());
        System.out.println(triangle.toString());

        input.close();
    }
}