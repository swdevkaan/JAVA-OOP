package geoometricobject;
import java.util.Arrays;

public class TestComparableRectangle {
    public static void main(String[] args) {
        ComparableRectangle rect1 = new ComparableRectangle(4.0, 5.0);   
        ComparableRectangle rect2 = new ComparableRectangle(3.0, 8.0);  
        ComparableRectangle rect3 = new ComparableRectangle(2.0, 10.0); 

         if (rect1.compareTo(rect2) < 0) {
            System.out.println("rect1, rect2'den daha küçük bir alana sahip.");
        }

         if (rect1.equals(rect3)) {
            System.out.println("rect1 ve rect3 alan bakımından birbirine eşit.");
        }

         ComparableRectangle[] rectangles = {
            new ComparableRectangle(3.4, 5.4),
            new ComparableRectangle(13.24, 56.7),
            new ComparableRectangle(7.4, 9.6),
            new ComparableRectangle(1.5, 2.5)
        };

        Arrays.sort(rectangles);

        System.out.println("\n--- Alanlarına Göre Sıralanmış Dikdörtgenler ---");
        for (ComparableRectangle rect : rectangles) {
            System.out.println(rect);
        }
    }
}