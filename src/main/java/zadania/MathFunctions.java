package zadania;

public class MathFunctions {

    // n! = 1 * 2 * 3 * ... * n
    public static int silnia(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // silnia(n)
    // silnia(0) = 0
    // silnia(1) = 1
    // silnia(n) = n * silnia(n - 1)

    public static int rSilnia(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return n * rSilnia(n - 1);
    }

    // 2^n pow(n)
    // pow(0) = 1
    // pow(n) = 2 * pow(n - 1)
    public static int rPow(int n) {
        if (n == 0) return 1;
        else return 2 * rPow(n - 1);
    }
}
