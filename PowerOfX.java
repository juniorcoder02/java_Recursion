public class PowerOfX {
    // Basic recursive approach to calculate x^n
    public static int power(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // Recursive call to compute x^(n-1)
        int xnm1 = power(x, n - 1);
        // Multiply x with x^(n-1) to get x^n
        int xnm = x * xnm1;
        return xnm;
    }

    // Optimized recursive approach to calculate x^n using divide and conquer
    public static int optimizedPower(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // Recursive call to calculate x^(n/2)
        int halfPower = optimizedPower(x, n / 2);
        // Square the result to get (x^(n/2))^2
        int halfPowerSq = halfPower * halfPower;

        // If n is odd, multiply by x once more
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println("power of " + x + " is :" + power(x, n));
        System.out.println("power of " + x + " is :" + optimizedPower(x, n));
    }
}
