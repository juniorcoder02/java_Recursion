public class ReverseNumber {

    // Global variable to store the reversed number for `reverse1` function
    public static int sum = 0;

    /**
     * Reverse a number using a global variable and recursion.
     * 
     * Approach:
     * - Use a recursive function to process each digit of the number.
     * - Extract the last digit of the number and append it to `sum`.
     * - Reduce the number by removing the last digit (divide by 10) and recurse.
     *
     * @param number The number to reverse.
     */
    public static void reverse1(int number) {
        // Base condition: If the number becomes 0, stop recursion
        if (number == 0) {
            return;
        }

        // Extract the last digit
        int rem = number % 10;

        // Append the digit to the result stored in the global variable
        sum = sum * 10 + rem;

        // Recurse with the remaining part of the number
        reverse1(number / 10);
    }

    /**
     * Reverse a number using a helper function and without relying on a global variable.
     * 
     * Approach:
     * - Calculate the number of digits in the input number.
     * - Use a helper function to process the digits with positional logic.
     * - Combine the digits in reverse order using mathematical operations.
     *
     * @param number The number to reverse.
     * @return The reversed number.
     */
    public static int reverse2(int number) {
        // Calculate the number of digits in the number
        // log10(number) gives the number of digits minus 1
        int digits = (int) (Math.log10(number)) + 1;

        // Call the helper function to reverse the number
        return helper(number, digits);
    }

    /**
     * Helper function to reverse a number with the help of digit count.
     * 
     * @param number The number to reverse.
     * @param digits The number of digits in the current number.
     * @return The reversed number.
     */
    public static int helper(int number, int digits) {
        // Base case: If the number has only one digit, return it
        if (number % 10 == number) {
            return number;
        }

        // Extract the last digit
        int rem = number % 10;

        // Recur with the remaining part of the number
        // Multiply the last digit by its positional value in the reversed number
        return rem * (int) (Math.pow(10, digits - 1)) + helper(number / 10, digits - 1);
    }

    public static void main(String[] args) {
        int num = 6843;

        // Reverse the number using reverse1
        reverse1(num);
        System.err.println("Reversed using reverse1 (global variable): " + sum);

        // Reverse the number using reverse2
        System.out.println("Reversed using reverse2 (helper function): " + reverse2(num));
    }
}
