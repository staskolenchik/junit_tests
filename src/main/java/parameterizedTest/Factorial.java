package parameterizedTest;

public class Factorial {
    public static int compute(int n) {
        if (n < 2) {
            return 1;
        }
        return n * compute(n - 1);
    }
}
