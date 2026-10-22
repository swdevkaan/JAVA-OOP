package bolum10;

public class PrimeFinder {
    public static StackOfIntegers getPrimesUpTo(int limit) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        return stack;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}