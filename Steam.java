public class Steam {

    // Recursive function to skip all occurrences of 'a' in the input string
    public static String skip(String actualStr) {

        // Base case: If the string is empty, return an empty string
        if (actualStr.isEmpty()) {
            return ""; // No more characters to process
        }

        // Extract the first character of the current string
        char ch = actualStr.charAt(0);

        // Check if the first character is 'a'
        if (ch == 'a') {
            // If it is 'a', skip this character and process the rest of the string
            return skip(actualStr.substring(1));
        } else {
            // If it is not 'a', include this character in the result
            // and process the rest of the string recursively
            return ch + skip(actualStr.substring(1));
        }
    }

    public static void main(String[] args) {
        // Input string to process
        String name = "adnan";

        // Call the skip function and print the result
        System.out.println(skip(name)); // Expected output: "dnn"
    }

}
