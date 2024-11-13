public class FirstAccour {

    /**
     * Recursive method to find the first occurrence of a key in an array.
     * 
     * @param arr the array of integers to search in
     * @param key the target integer to find
     * @param i the current index in the array to check
     * @return the index of the first occurrence of the key, or -1 if the key is not found
     */
    public static int firstAccourance(int[] arr, int key, int i) {
        // Base case: If we reach the end of the array without finding the key
        if (i == arr.length) {
            return -1;
        }
        
        // Check if the current element matches the key
        if (arr[i] == key) {
            return i; // Return the current index as the first occurrence
        }
        
        // Recursive call: move to the next index in the array
        return firstAccourance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 5, 4, 5, 6 }; // Sample array
        int key = 8; // Key to search for

        // Call the method and print the result
        System.out.println("First occurrence of the given key is: " + firstAccourance(arr, key, 0));
    }
}
