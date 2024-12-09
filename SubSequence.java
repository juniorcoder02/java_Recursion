public class SubSequence {

    // Recursive function to print all subsequences of a given string
    public static void subseq(String p, String up) {

        // Base case: If the string to process (up) is empty, print the current subsequence (p)
        if (up.isEmpty()) {
            System.out.println(p); // Print the accumulated subsequence
            return; // End the recursion
        }

        // Extract the first character of the unprocessed string
        char c = up.charAt(0);

        // Recursive call excluding the current character (do not include 'c' in subsequence)
        subseq(p, up.substring(1));

        // Recursive call including the current character (include 'c' in subsequence)
        subseq(p + c, up.substring(1));
    }

    public static void main(String[] args) {
        // Input string to generate subsequences from
        String name = "abc";

        // Call the recursive function with an empty processed part (p) and the full input string (up)
        subseq("", name);
    }
}
