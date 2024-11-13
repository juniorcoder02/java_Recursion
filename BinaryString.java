public class BinaryString {

    // Recursive function to print all binary strings of length n without consecutive '1's
    public static void binString(int n, int lastPlace, String newStr) {
        // Base case: if n becomes 0, we have a valid binary string of length N
        if (n == 0) {
            System.out.println(newStr); // Print the complete binary string
            return;
        }

        // Choice 1: Add '0' to the string
        binString(n - 1, 0, newStr + "0");

        // Choice 2: Add '1' to the string (only if the last character was '0')
        if (lastPlace == 0) {
            binString(n - 1, 1, newStr + "1");
        }
    }

    public static void main(String[] args) {
        int N = 3; // Example input for binary string length
        binString(N, 0, ""); // Start with an empty string and lastPlace set to '0'
    }
}
