public class RemoveDuplicate {
    // Recursive function to remove duplicate characters
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map) {
        // Base case: If the end of the string is reached
        if (idx == str.length()) {
            System.out.println(newStr); // Print the resulting string without duplicates
            return;
        }
        
        // Current character
        char currChar = str.charAt(idx);
        
        // Check if this character has already been added to the new string
        if (!map[currChar - 'a']) { // If not, add it
            map[currChar - 'a'] = true; // Mark character as added
            newStr.append(currChar); // Append the character to newStr
        }
        
        // Recursive call for the next character
        removeDuplicate(str, idx + 1, newStr, map);
    }

    public static void main(String[] args) {
        String str = "aadiihereeee"; // Input string with duplicates
        StringBuilder newStr = new StringBuilder(); // StringBuilder to store result
        removeDuplicate(str, 0, newStr, new boolean[26]); // Start the recursion
    }
}
