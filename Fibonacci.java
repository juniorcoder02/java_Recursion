public class Fibonacci {

    /**
     * This method calculates the nth Fibonacci number using recursion.
     * 
     * Fibonacci Sequence Definition:
     * - The Fibonacci sequence is defined as a series of numbers where each number 
     *   is the sum of the two preceding numbers.
     * - The sequence starts with F(0) = 0, F(1) = 1, and continues as:
     *   F(n) = F(n-1) + F(n-2).
     * - Example: F(7) = F(6) + F(5) = 8 + 5 = 13.
     * 
     * Recursive Approach:
     * - The Fibonacci calculation can be broken down recursively as:
     *   F(n) = F(n-1) + F(n-2), where F(n-1) and F(n-2) are the Fibonacci numbers
     *   of the previous two positions.
     * - The base cases are F(0) = 0 and F(1) = 1, as defined by the sequence.
     *
     * Time Complexity:
     * - The time complexity of this approach is O(2^n), because each call to F(n)
     *   generates two additional recursive calls, leading to exponential growth.
     * 
     * Space Complexity:
     * - The space complexity is O(n), due to the call stack created by recursive 
     *   calls. Each level of recursion adds a new frame to the stack until we reach
     *   the base case.
     * 
     * @param n - the position in the Fibonacci sequence for which we want the value
     * @return the Fibonacci number at position n
     */
    public static int fib(int n) {
        // Base cases: F(0) is 0 and F(1) is 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive calls: calculate F(n-1) and F(n-2)
        int fnm1 = fib(n - 1); // Fibonacci of (n-1)
        int fnm2 = fib(n - 2); // Fibonacci of (n-2)
        
        // Return the sum of F(n-1) and F(n-2) to get F(n)
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        int n = 7; // The position in the Fibonacci sequence
        System.out.println("Fibonacci of " + n + "th number is: " + fib(n)); // Output the result
    }
}
