public class SumOfNum {

    /**
     * This method calculates the sum of all integers from 1 to a given integer 'n' using recursion.
     * 
     * Sum of Natural Numbers Definition:
     * - The sum of the first 'n' natural numbers is given by the formula:
     *   sum(n) = 1 + 2 + 3 + ... + n
     * - Example: sum(5) = 1 + 2 + 3 + 4 + 5 = 15.
     * 
     * Recursive Approach:
     * - We can break down the sum recursively as:
     *   sum(n) = n + sum(n-1), where sum(n-1) is the sum of numbers from 1 to n-1.
     * - The base case is sum(1) = 1, as the sum of the first number (1) is just 1.
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
     * @param n - the integer up to which we want to calculate the sum
     * @return the sum of all integers from 1 to n
     */
    public static int calcSum(int n) {
        // Base case: sum(1) is 1
        if (n == 1) 
            return 1;
        
        // Recursive call: calculate sum of (n-1) numbers
        int prevSum = calcSum(n - 1);
        
        // Calculate sum of numbers from 1 to n by adding n to sum of (n-1)
        int sum = n + prevSum;
        
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        int n = 5; // The integer up to which we want the sum
        System.out.println(calcSum(n)); // Output the result of sum(5)
    }
}
