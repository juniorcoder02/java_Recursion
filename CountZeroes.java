public class CountZeroes {
    // Function to count the number of zeros in a given number
    public static int countZeroes(int num) {
        // Base case: If the number is 0, return 1 (special case)
        if (num == 0) {
            return 1;
        }
        // Helper function to recursively count zeros
        return countHelper(num, 0);
    }

    // Helper function to count zeros using recursion
    private static int countHelper(int num, int zeroCount) {
        // Base case: If the number becomes 0, return the count of zeros
        if (num == 0) {
            return zeroCount;
        }

        // Check the last digit; if it is 0, increment the zeroCount
        if (num % 10 == 0) {
            zeroCount++;
        }

        // Recursive call with the number divided by 10 (removing the last digit)
        return countHelper(num / 10, zeroCount);
    }

    public static void main(String[] args) {
        int num = 1203040;
        System.out.println("Number of zeros: " + countZeroes(num)); // Output: 3
    }
}
