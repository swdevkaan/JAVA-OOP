import java.util.GregorianCalendar;

public class calendar {
    public static void main(String[] args) {
       
        GregorianCalendar takvim = new GregorianCalendar();

     
        System.out.println("Simdiki Tarih:");
        System.out.println("Yıl: " + takvim.get(GregorianCalendar.YEAR));
        System.out.println("Ay: " + (takvim.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Gun: " + takvim.get(GregorianCalendar.DAY_OF_MONTH));

       
        takvim.setTimeInMillis(1234567898765L);

       
        System.out.println("\n1234567898765L Milisaniye Sonraki Tarih:");
        System.out.println("Yil: " + takvim.get(GregorianCalendar.YEAR));
        System.out.println("Ay: " + (takvim.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Gun: " + takvim.get(GregorianCalendar.DAY_OF_MONTH));
    }
}