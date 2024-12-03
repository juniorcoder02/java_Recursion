public class SumOfDigits {

    /**
     * Recursive function to calculate the sum of digits of a number.
     *
     * Approach:
     * - Use recursion to break down the number into its individual digits.
     * - Extract the last digit of the number using `% 10`.
     * - Add the extracted digit to the sum of the remaining digits.
     * - Base case is when the number becomes 0.
     *
     * @param val The input number.
     * @return The sum of all digits of the number.
     */
    public static int findSum(int val) {
        // Base case: If the number is 0, return 0
        if (val == 0) {
            return 0;
        }

        // Extract the last digit of the number
        int lastDigit = val % 10;

        // Add the last digit to the sum of the remaining digits
        return lastDigit + findSum(val / 10);
    }

    public static void main(String[] args) {
        // Input number
        int digit = 123456;

        // Call the function and print the sum of digits
        System.out.println("Sum of digits: " + findSum(digit));
    }
}
