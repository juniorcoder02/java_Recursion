public class Factorial {

    /**
     * This method calculates the factorial of a given integer 'n' using recursion.
     * 
     * Factorial Definition:
     * - The factorial of a non-negative integer 'n' (denoted as n!) is the 
     *   product of all positive integers less than or equal to 'n'.
     * - Example: 5! = 5 * 4 * 3 * 2 * 1 = 120.
     * 
     * Recursive Approach:
     * - The factorial function can be broken down recursively as:
     *   n! = n * (n-1)!, where (n-1)! is the factorial of (n-1).
     * - The base case is 0! = 1, as the factorial of 0 is defined to be 1.
     *
     * Time Complexity:
     * - The time complexity of this approach is O(n), as the function calls itself
     *   'n' times (from n down to 1).
     * 
     * Space Complexity:
     * - The space complexity is also O(n), due to the call stack created by 
     *   recursive calls. Each recursive call adds a new frame to the stack, which
     *   is cleared once the function returns.
     * 
     * @param n - the integer for which we want to calculate the factorial
     * @return the factorial of n
     */
    public static int printFactorial(int n) {
        // Base case: 0! is 1
        if (n == 0) 
            return 1;
        
        // Recursive call: calculate factorial of (n-1)
        int prevFact = printFactorial(n - 1);
        
        // Calculate factorial of n by multiplying n with factorial of (n-1)
        int fact = n * prevFact;
        
        return fact; // Return the calculated factorial
    }

    public static void main(String[] args) {
        int n = 5; // The integer we want the factorial of
        System.out.println(printFactorial(n)); // Output the result of 5!
    }
}
