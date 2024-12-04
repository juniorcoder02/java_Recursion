public class Palindrome {
    public static boolean checkPalindrome(String num, int start, int end) {
        // Base case: if start index is greater than or equal to end index, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Check if the digits at the start and end indices are equal
        if (num.charAt(start) != num.charAt(end)) {
            return false;
        }

        // Recursively check the remaining digits
        return checkPalindrome(num, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int num = 12321;
        String numStr = String.valueOf(num); // Convert number to a string
        System.out.println("Is Palindrome: " + checkPalindrome(numStr, 0, numStr.length() - 1));
    }
}
