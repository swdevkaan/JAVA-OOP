package bolum10;

public class TestDisplayPrimes {
    public static void main(String[] args) {
        StackOfIntegers stack = PrimeFinder.getPrimesUpTo(120);

        System.out.println("120'den küçük asal sayılar (azalan sırada):");
        int count = 0;
        while (!stack.empty()) {
            System.out.printf("%-4d", stack.pop());
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}