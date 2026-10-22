package bolum10;

public class TestApproximateE {
    public static void main(String[] args) {
        System.out.println("i Değeri\tApproximate e (25 Basamak Hassasiyet)");
        System.out.println("--------------------------------------------------");

        for (int i = 100; i <= 1000; i += 100) {
            System.out.println(i + "\t\t" + ApproximateE.calculateE(i));
        }
    }
}